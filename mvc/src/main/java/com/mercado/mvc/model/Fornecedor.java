package com.mercado.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Fornecedor {
    private Long idFornecedor;
    private String nome;
    private String cnpj;
}
