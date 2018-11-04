package com.dalong.dnflogs.dnflogs.component;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.*;
import java.net.URLEncoder;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by dalong on 04/11/2018.
 */

@Component
public class APIComponent {
    public StringBuffer get(String host, Map<String, String> headers) throws IOException {
        HttpURLConnection connection = getConnection(host, headers, RequestMethod.GET);
        return getResponse(connection);
    }

    public StringBuffer post(String host, Map<String, String> headers, Map<String, String> parameters) throws IOException {
        HttpURLConnection connection = getConnection(host, headers, RequestMethod.POST);
        bindParameters(connection, parameters);
        return getResponse(connection);
    }

    private HttpURLConnection getConnection(String host, Map<String, String> headers, RequestMethod method) throws IOException {
        URL url = new URL(host);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(method.name());
        headers.forEach(connection::setRequestProperty);
        return connection;
    }

    private void bindParameters(HttpURLConnection connection, Map<String, String> parameterMap) throws IOException {
        String parameters = parameterMap.entrySet().parallelStream()
                .map(p -> encodeUrl(p.getKey()) + "=" + encodeUrl(p.getValue()))
                .reduce((p1, p2) -> p1 + "&" + p2).orElse("");

        connection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
        dataOutputStream.writeBytes(parameters);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    private StringBuffer getResponse(HttpURLConnection connection) throws IOException {
        int responseCode = connection.getResponseCode();
        InputStream inputStream = responseCode == HttpStatus.OK.value() ? connection.getInputStream() : connection.getErrorStream();
        return getResponseFromConnectionStream(inputStream);
    }

    private StringBuffer getResponseFromConnectionStream(InputStream inputStream) throws IOException  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuffer response = new StringBuffer();

        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null) {
            response.append(inputLine);
        }
        bufferedReader.close();
        return response;
    }

    // TODO
    public static String encodeUrl(String value) {
        return value;
//        try {
//            return URLEncoder.encode(value, CHARSET_UTF_8);
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException("");
//        }
    }
}
