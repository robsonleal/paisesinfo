package com.davi.paisesinfo.mapper;

import com.davi.paisesinfo.dto.Currency;
import com.davi.paisesinfo.model.Moeda;
import org.springframework.stereotype.Component;

@Component
public class MoedaMapper {
    public Moeda toMoeda(Currency source) {
        Moeda destination = new Moeda();

        destination.setCodigoNumerico(source.getNumericCode());
        destination.setCodigo(source.getCode());
        destination.setNome(source.getName());
        destination.setMenorUnidade(source.getMinorUnits());

        return destination;
    }
}
