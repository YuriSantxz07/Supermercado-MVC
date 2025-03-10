package com.mercado.mvc.banco;

import com.mercado.mvc.model.Fornecedor;

import java.util.ArrayList;
import java.util.List;

public class BancoFornecedor {
    private final List<Fornecedor> fornecedores = new ArrayList<>();

    public void insert(Fornecedor f) {
        fornecedores.add(f);
    }

    public Fornecedor procurarId(Long id) {
        return fornecedores.stream()
                .filter(f -> f.getIdFornecedor().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Fornecedor> findAll() {
        return new ArrayList<>(fornecedores);
    }

    public boolean update(Fornecedor f) {
        int index = fornecedores.indexOf(procurarId(f.getIdFornecedor()));
        if (index != -1) {
            fornecedores.set(index, f);
            return true;
        }
        return false;
    }

    public boolean delete(Long id) {
        return fornecedores.removeIf(f -> f.getIdFornecedor().equals(id));
    }
}
