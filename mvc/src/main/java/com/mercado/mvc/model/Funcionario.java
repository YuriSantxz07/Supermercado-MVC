package com.mercado.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Funcionario {
    private Long idFuncionario;
    private String nome;
    private String cpf;
    private double comissao;
}
