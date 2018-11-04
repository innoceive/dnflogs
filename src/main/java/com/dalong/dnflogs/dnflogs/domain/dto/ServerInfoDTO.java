package com.dalong.dnflogs.dnflogs.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by dalong on 04/11/2018.
 */
public class ServerInfoDTO {

    @JsonProperty("serverId")
    private String serverId;

    @JsonProperty("serverName")
    private String serverName;

    public ServerInfoDTO() {}

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
}
