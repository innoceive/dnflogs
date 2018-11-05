package com.dalong.dnflogs.dnflogs.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by dalong on 05/11/2018.
 */
public class BuffDTO {
    @JsonProperty("name")
    private String name;

    @JsonProperty("level")
    private String level;

    @JsonProperty("status")
    private List<OptionDTO> status;
}
