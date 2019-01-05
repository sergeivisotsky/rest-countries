package org.sergei.countries.controller;

import org.sergei.countries.pojo.Country;
import org.sergei.countries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sergei Visotsky
 */
@Controller
@RequestMapping("/")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public String welcome(Model model) {
        final String countryName = "Latvia";

        Country[] country = countryService.getCountryByName(countryName);
        model.addAttribute("countryName", country[0].getCountryName());
        model.addAttribute("region", country[0].getRegion());
        model.addAttribute("subregion", country[0].getSubregion());
        model.addAttribute("alphaTwoCode", country[0].getAlphaTwoCode());
        model.addAttribute("alphaThreeCode", country[0].getAlphaThreeCode());

        Country[] countryList = countryService.getAllCountries();
        model.addAttribute("countries", countryList);

        return "index";
    }
}
