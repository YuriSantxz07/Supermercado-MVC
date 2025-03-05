package com.mercado.mvc.model;

import lombok.*;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Cliente {
    private Integer idCliente;
    private String nome;
    private String cpf;
    private List<Date> dataCompraC;
    private List<Double> valorCompraC;
}
