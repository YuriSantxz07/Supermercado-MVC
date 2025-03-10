package com.mercado.mvc.banco;

import com.mercado.mvc.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class BancoVendas {
    private final List<Venda> vendas = new ArrayList<>();

    public void insert(Venda v) {
        vendas.add(v);
    }

    public Venda procurarId(Long id) {
        return vendas.stream()
                .filter(v -> v.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Venda> findAll() {
        return new ArrayList<>(vendas);
    }

    public boolean update(Venda v) {
        int index = vendas.indexOf(procurarId(v.getId()));
        if (index != -1) {
            vendas.set(index, v);
            return true;
        }
        return false;
    }

    public boolean delete(Long id) {
        return vendas.removeIf(v -> v.getId().equals(id));
    }
}
