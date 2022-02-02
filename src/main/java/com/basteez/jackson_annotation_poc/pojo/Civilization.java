package com.basteez.jackson_annotation_poc.pojo;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

public class Civilization {
    @JsonProperty("Id")
    public Integer id;

    @JsonProperty("Name")
    public String name;

    @JsonProperty("Expansion")
    public String expansion;

    @JsonProperty("ArmyType")
    public String armyType;

    @JsonProperty("UniqueUnit")
    public List<String> uniqueUnit;

    @JsonProperty("UniqueTech")
    public List<String> uniqueTech;

    @JsonProperty("TeamBonus")
    public String teamBonus;

    @JsonProperty("CivilizationBonus")
    public List<String> civilizationBonus;

    @JsonGetter("Id")
    public Integer getId() {
        return id;
    }

    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonGetter("Name")
    public String getName() {
        return name;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("Expansion")
    public String getExpansion() {
        return expansion;
    }

    @JsonSetter("expansion")
    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    @JsonGetter("ArmyType")
    public String getArmyType() {
        return armyType;
    }

    @JsonSetter("army_type")
    public void setArmyType(String armyType) {
        this.armyType = armyType;
    }

    @JsonGetter("UniqueUnit")
    public List<String> getUniqueUnit() {
        return uniqueUnit;
    }

    @JsonSetter("unique_unit")
    public void setUniqueUnit(List<String> uniqueUnit) {
        this.uniqueUnit = uniqueUnit;
    }

    @JsonGetter("UniqueTech")
    public List<String> getUniqueTech() {
        return uniqueTech;
    }

    @JsonSetter("unique_tech")
    public void setUniqueTech(List<String> uniqueTech) {
        this.uniqueTech = uniqueTech;
    }

    @JsonGetter("TeamBonus")
    public String getTeamBonus() {
        return teamBonus;
    }

    @JsonSetter("team_bonus")
    public void setTeamBonus(String teamBonus) {
        this.teamBonus = teamBonus;
    }

    @JsonGetter("CivilizationBonus")
    public List<String> getCivilizationBonus() {
        return civilizationBonus;
    }

    @JsonSetter("civilization_bonus")
    public void setCivilizationBonus(List<String> civilizationBonus) {
        this.civilizationBonus = civilizationBonus;
    }
}
