package org.sergei.countries.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.sergei.countries.pojo.CountryListVO;
import org.sergei.countries.pojo.CountryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class CountryService {
    private static final String REQUEST_URI_GET_ALL = "https://restcountries.eu/rest/v2/all";
    private static final String REQUEST_URI_GET_BY_NAME = "https://restcountries.eu/rest/v2/name/{countryName}";

    private final RestTemplate restTemplate;
    private final HttpHeaders httpHeaders;
    private final ObjectMapper objectMapper;

    @Autowired
    public CountryService(RestTemplate restTemplate, HttpHeaders httpHeaders, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.httpHeaders = httpHeaders;
        this.objectMapper = objectMapper;
    }

    public CountryVO[] getCountryByName(String countryName) {
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return restTemplate.getForObject(REQUEST_URI_GET_BY_NAME, CountryVO[].class, countryName);
    }

    public CountryVO[] getAllCountries() {
       return restTemplate.getForObject(REQUEST_URI_GET_ALL, CountryVO[].class);
    }
}
