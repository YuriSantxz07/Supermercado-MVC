package com.mercado.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Produto {
    private Long idProduto;
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEmEstoque;
    private boolean disponivel;
}
