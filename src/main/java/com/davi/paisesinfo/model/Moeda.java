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
public class Moeda {
    private int codigoNumerico;
    private String codigo;
    private String nome;
    private int menorUnidade;
}
