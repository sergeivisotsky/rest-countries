package org.sergei.countries.pojo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sergei Visotsky
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Country {
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
}
