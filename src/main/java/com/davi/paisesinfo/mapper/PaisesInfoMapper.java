package com.davi.paisesinfo.mapper;

import com.davi.paisesinfo.dto.CountryInfo;
import com.davi.paisesinfo.model.PaisesInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaisesInfoMapper {

    public PaisesInfo toPaisesInfo(CountryInfo source) {
        PaisesInfo destination = new PaisesInfo();

        destination.setIsoAlfa2(source.getIsoAlpha2());
        destination.setIsoAlfa3(source.getIsoAlpha3());
        destination.setNome(source.getName());
        destination.setIsoNome(source.getIsoName());
        destination.setIsoNomeCompleto(source.getIsoNameFull());
        destination.setRegiao(source.getUnRegion());
        destination.setEmojiBandeira(source.getCountryFlagEmoji());
        destination.setIndependente(source.isIndependent());

        return destination;
    }

}
