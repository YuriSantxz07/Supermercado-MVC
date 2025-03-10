package com.mercado.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Venda {
    private Long id;
    private String cliente;
    private LocalDate dataVenda;
    private List<Produto> produtos;
    private double valorTotal;
}
