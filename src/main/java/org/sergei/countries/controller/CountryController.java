package org.sergei.countries.controller;

import org.sergei.countries.pojo.CountryVO;
import org.sergei.countries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public String welcome(Model model) {
        final String countryName = "Latvia";

        CountryVO[] countryVO = countryService.getCountryByName(countryName);
        model.addAttribute("countryName", countryVO[0].getCountryName());
        model.addAttribute("region", countryVO[0].getRegion());
        model.addAttribute("subregion", countryVO[0].getSubregion());
        model.addAttribute("alphaTwoCode", countryVO[0].getAlphaTwoCode());
        model.addAttribute("alphaThreeCode", countryVO[0].getAlphaThreeCode());

        CountryVO[] countryVOList = countryService.getAllCountries();
        for (CountryVO countryVO1 : countryVOList) {
            model.addAttribute("countries", countryVO1);
        }
        return "index";
    }
}
