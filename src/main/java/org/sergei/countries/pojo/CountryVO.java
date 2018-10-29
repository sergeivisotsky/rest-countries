/*
 * Copyright (c) 2018 Sergei Visotsky
 */

package org.sergei.countries.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class CountryVO {
    @JsonSerialize
    @JsonProperty("name")
    private String countryName;

    @JsonSerialize
    @JsonProperty("region")
    private String region;

    @JsonSerialize
    @JsonProperty("subregion")
    private String subregion;

    @JsonSerialize
    @JsonProperty("alpha2Code")
    private String alphaTwoCode;

    @JsonSerialize
    @JsonProperty("alpha3Code")
    private String alphaThreeCode;

    public CountryVO() {
    }

    public CountryVO(String countryName, String region, String subregion, String alphaTwoCode, String alphaThreeCode) {
        this.countryName = countryName;
        this.region = region;
        this.subregion = subregion;
        this.alphaTwoCode = alphaTwoCode;
        this.alphaThreeCode = alphaThreeCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    public void setAlphaTwoCode(String alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }

    public String getAlphaThreeCode() {
        return alphaThreeCode;
    }

    public void setAlphaThreeCode(String alphaThreeCode) {
        this.alphaThreeCode = alphaThreeCode;
    }
}
