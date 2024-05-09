package com.davi.paisesinfo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdminLanguage {
    private String isoAlpha3;
    private String isoAlpha2;
    private String isoName;
    private String nativeName;
}
