package com.dalong.dnflogs.dnflogs.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by dalong on 05/11/2018.
 */
public class OptionDTO {
    @JsonProperty("name")
    private String name;

    @JsonProperty("value")
    private Integer value;
}
