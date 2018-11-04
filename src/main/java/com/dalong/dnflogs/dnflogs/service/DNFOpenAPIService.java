package com.dalong.dnflogs.dnflogs.service;

import com.dalong.dnflogs.dnflogs.component.APIComponent;
import com.dalong.dnflogs.dnflogs.domain.APIParameter;
import com.dalong.dnflogs.dnflogs.domain.APIResponse;
import com.dalong.dnflogs.dnflogs.domain.dto.ServerInfoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dalong on 04/11/2018.
 */


@Service
public class DNFOpenAPIService {
    private ObjectMapper mapper;

    private static final String API_KEY = "XqJVxMcYOVfffAcnbfBOzXt4Pciwkexa";
    private static final String REQUEST_URL = "https://api.neople.co.kr/df/servers?apikey=XqJVxMcYOVfffAcnbfBOzXt4Pciwkexa";
    private Map<String, String> headers;

    @Autowired
    private APIComponent apiComponent;

    @PostConstruct
    public void init() {
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        headers = new HashMap<String, String>();
    }

    public List<ServerInfoDTO> findAll() {
        try {
            APIResponse response = getAPIResponse(new APIParameter());
            return getServerInfoListFromAPIResponse(response);
        } catch (IOException e) {
            return new ArrayList<ServerInfoDTO>();
        }
    }

    private APIResponse getAPIResponse(APIParameter parameter) throws IOException {
        String requestURL = REQUEST_URL;

        StringBuffer stringBuffer = apiComponent.get(requestURL, headers);
        String responseBody = stringBuffer.toString();
        APIResponse response = mapper.readValue(responseBody, APIResponse.class);

        return response;
    }

    private List<ServerInfoDTO> getServerInfoListFromAPIResponse(APIResponse response) {
        return response.getServerInfos();
    }
}
