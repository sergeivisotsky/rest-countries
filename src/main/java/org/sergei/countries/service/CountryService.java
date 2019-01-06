package org.sergei.countries.service;

import org.sergei.countries.pojo.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * @author Sergei Visotsky
 */
@Service
public class CountryService {
    private static final String REQUEST_URI_GET_ALL = "https://restcountries.eu/rest/v2/all";
    private static final String REQUEST_URI_GET_BY_NAME = "https://restcountries.eu/rest/v2/name/{countryName}";

    private final RestTemplate restTemplate;
    private final HttpHeaders httpHeaders;

    @Autowired
    public CountryService(RestTemplate restTemplate, HttpHeaders httpHeaders) {
        this.restTemplate = restTemplate;
        this.httpHeaders = httpHeaders;
    }

    public Country[] getCountryByName(String countryName) {
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return restTemplate.getForObject(REQUEST_URI_GET_BY_NAME, Country[].class, countryName);
    }

    public Country[] getAllCountries() {
        return restTemplate.getForObject(REQUEST_URI_GET_ALL, Country[].class);
    }
}
