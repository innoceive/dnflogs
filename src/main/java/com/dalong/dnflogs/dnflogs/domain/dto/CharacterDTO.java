package com.dalong.dnflogs.dnflogs.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by dalong on 05/11/2018.
 */
public class CharacterDTO {
    @JsonProperty("characterId")
    private String characterId;

    @JsonProperty("characterName")
    private String characterName;

    @JsonProperty("level")
    private Integer level;

    @JsonProperty("jobId")
    private String jobId;

    @JsonProperty("jobGrowId")
    private String jobGrowId;

    @JsonProperty("jobName")
    private String jobName;

    @JsonProperty("jobGrowName")
    private String jobGrowName;

    @JsonProperty("adventureName")
    private String adventureName;

    @JsonProperty("guildId")
    private String guildId;

    @JsonProperty("guildName")
    private String guildName;

    @JsonProperty("buff")
    private List<BuffDTO> buff;

    @JsonProperty("status")
    private List<OptionDTO> status;
}
