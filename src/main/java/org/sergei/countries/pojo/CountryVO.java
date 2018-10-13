package org.sergei.countries.pojo;

public class CountryVO {
    private String countryName;
    private String region;
    private String subregion;
    private String alphaTwoCode;
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
