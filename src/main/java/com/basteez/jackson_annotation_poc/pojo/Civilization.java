package com.basteez.jackson_annotation_poc.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Civilization {
    @JsonProperty("id")
    public Integer id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("expansion")
    public String expansion;

    @JsonProperty("army_type")
    public String armyType;

    @JsonProperty("unique_unit")
    public List<String> uniqueUnit;

    @JsonProperty("unique_tech")
    public List<String> uniqueTech;

    @JsonProperty("team_bonus")
    public String teamBonus;

    @JsonProperty("civilization_bonus")
    public List<String> civilizationBonus;

}
