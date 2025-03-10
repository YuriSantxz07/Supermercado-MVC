package com.mercado.mvc.controller;

import com.mercado.mvc.banco.BancoFornecedor;
import com.mercado.mvc.banco.BancoProduto;
import com.mercado.mvc.model.Fornecedor;
import com.mercado.mvc.model.Produto;

import java.util.List;

public class ProdutoController {
    BancoProduto bancoProduto = new BancoProduto();

    public List<Produto> pegarTodosOsProdutos() {
        return bancoProduto.findAll();
    }

    public void adicionarProduto(Produto p) {
        bancoProduto.insert(p);
    }

    public boolean atualizarProduto(Produto p) {
        return bancoProduto.update(p);
    }

    public boolean removerProduto(Long id) {
        return bancoProduto.delete(id);
    }
    public boolean procurarId(Long id){
        return bancoProduto.delete(id);
    }
}
