package org.sergei.countries.pojo;

import java.util.List;

public class CountryListVO {
    private List<CountryVO> countryVOList;

    public CountryListVO() {
    }

    public CountryListVO(List<CountryVO> countryVOList) {
        this.countryVOList = countryVOList;
    }

    public List<CountryVO> getCountryVOList() {
        return countryVOList;
    }

    public void setCountryVOList(List<CountryVO> countryVOList) {
        this.countryVOList = countryVOList;
    }
}
