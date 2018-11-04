package com.dalong.dnflogs.dnflogs.domain;

import com.dalong.dnflogs.dnflogs.domain.dto.ServerInfoDTO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by dalong on 04/11/2018.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class APIResponse {

    @JsonProperty("rows")
    private List<ServerInfoDTO> serverInfos;

    public List<ServerInfoDTO> getServerInfos() {
        return serverInfos;
    }

    public void setServerInfos(List<ServerInfoDTO> serverInfos) {
        this.serverInfos = serverInfos;
    }
}
