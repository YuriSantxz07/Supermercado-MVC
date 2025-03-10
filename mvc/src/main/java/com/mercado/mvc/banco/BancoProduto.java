package com.mercado.mvc.banco;

import com.mercado.mvc.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class BancoProduto {
    private final List<Produto> produtos = new ArrayList<>();

    public void insert(Produto p) {
        produtos.add(p);
    }

    public Produto procurarId(Long id) {
        return produtos.stream()
                .filter(p -> p.getIdProduto().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Produto> findAll() {
        return new ArrayList<>(produtos);
    }

    public boolean update(Produto p) {
        int index = produtos.indexOf(procurarId(p.getIdProduto()));
        if (index != -1) {
            produtos.set(index, p);
            return true;
        }
        return false;
    }

    public boolean delete(Long id) {
        return produtos.removeIf(p -> p.getIdProduto().equals(id));
    }
}
