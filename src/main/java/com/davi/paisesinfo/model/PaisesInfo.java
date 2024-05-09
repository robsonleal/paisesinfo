package com.davi.paisesinfo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class PaisesInfo {
    @Id
    private String id;
    private String isoAlfa2;
    private String isoAlfa3;
    private String nome;
    private String isoNome;
    private String isoNomeCompleto;
    private List<LinguagemNativa> isoLinguagensNativas;
    private String regiao;
    private Moeda moeda;
    private String emojiBandeira;
    private boolean independente;
}
