package com.davi.paisesinfo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryInfo {
    private long id;
    private String isoAlpha2;
    private String isoAlpha3;
    private String name;
    private String isoName;
    private String isoNameFull;
    private List<AdminLanguage> isoAdminLanguages;
    private String unRegion;
    private Currency currency;
    private String countryFlagEmoji;
    private boolean isIndependent;
}