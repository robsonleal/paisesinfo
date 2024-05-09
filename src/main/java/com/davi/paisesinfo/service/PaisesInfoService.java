package com.davi.paisesinfo.service;

import com.davi.paisesinfo.client.CountryInfoClient;
import com.davi.paisesinfo.dto.CountryInfo;
import com.davi.paisesinfo.exception.ResourceNotFoundException;
import com.davi.paisesinfo.mapper.LinguagemNativaMapper;
import com.davi.paisesinfo.mapper.MoedaMapper;
import com.davi.paisesinfo.mapper.PaisesInfoMapper;
import com.davi.paisesinfo.model.LinguagemNativa;
import com.davi.paisesinfo.model.Moeda;
import com.davi.paisesinfo.model.PaisesInfo;
import com.davi.paisesinfo.repository.PaisesInfoRepository;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaisesInfoService {

    @Value("${spring.api.key}")
    private String key;

    private final PaisesInfoRepository paisesInfoRepository;
    private final CountryInfoClient countryInfoClient;
    private final PaisesInfoMapper paisesInfoMapper;
    private final LinguagemNativaMapper linguagemNativaMapper;
    private final MoedaMapper moedaMapper;

    public PaisesInfo getCountryInfo(String code, String localityLanguage) {
        PaisesInfo paisesInfo = paisesInfoRepository.findByIsoAlfa3(code).orElseGet(() -> getPaisesInfoFromCountryInfo(code, localityLanguage));
        paisesInfoRepository.save(paisesInfo);
        return paisesInfo;
    }

    private PaisesInfo getPaisesInfoFromCountryInfo(String code, String localityLanguage) {
        CountryInfo countryInfo;
        try {
            countryInfo = countryInfoClient.getCountryInfo(key, code, localityLanguage);
        } catch (FeignException.NotFound ex) {
            throw new ResourceNotFoundException(ex.getMessage());
        }
        PaisesInfo paisesInfo = paisesInfoMapper.toPaisesInfo(countryInfo);
        Moeda moeda = moedaMapper.toMoeda(countryInfo.getCurrency());
        paisesInfo.setMoeda(moeda);
        List<LinguagemNativa> linguagensNativas = linguagemNativaMapper.toListLinguagensNativas(countryInfo.getIsoAdminLanguages());
        paisesInfo.setIsoLinguagensNativas(linguagensNativas);
        return paisesInfo;
    }

}
