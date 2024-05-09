package com.davi.paisesinfo.client;

import com.davi.paisesinfo.dto.CountryInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PaisesInfo", url = "https://api.bigdatacloud.net")
public interface CountryInfoClient {

    @GetMapping(value = "/data/country-info", produces = "*/*")
    CountryInfo getCountryInfo(@RequestParam("key") String key,
                               @RequestParam("code") String code,
                               @RequestParam("localityLanguage") String localityLanguage);

}
