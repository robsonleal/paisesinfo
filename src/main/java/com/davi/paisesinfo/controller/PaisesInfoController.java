package com.davi.paisesinfo.controller;

import com.davi.paisesinfo.model.PaisesInfo;
import com.davi.paisesinfo.service.PaisesInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaisesInfoController {

    private final PaisesInfoService paisesInfoService;

    @GetMapping("/paises-info")
    public ResponseEntity<PaisesInfo> getCountryInfo(@RequestParam String code,
                                                     @RequestParam String localityLanguage) {

        return ResponseEntity.ok(paisesInfoService.getCountryInfo(code, localityLanguage));
    }

}
