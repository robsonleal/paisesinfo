package com.davi.paisesinfo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class LinguagemNativa {
    private String isoAlfa3;
    private String isoAlfa2;
    private String isoNome;
    private String nomeNativo;
}
