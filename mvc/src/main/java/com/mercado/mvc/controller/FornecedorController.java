package com.mercado.mvc.controller;

import com.mercado.mvc.banco.BancoFornecedor;
import com.mercado.mvc.model.Fornecedor;

import java.util.List;

public class FornecedorController {
    BancoFornecedor bancoFornecedor = new BancoFornecedor();

    public List<Fornecedor> pegarTodosOsFornecedores() {
        return bancoFornecedor.findAll();
    }

    public void adicionarFornecedor(Fornecedor f) {
        bancoFornecedor.insert(f);
    }

    public boolean atualizarFornecedor(Fornecedor f) {
        return bancoFornecedor.update(f);
    }

    public boolean removerFornecedor(Long id) {
        return bancoFornecedor.delete(id);
    }
    public boolean procurarId(Long id){
        return bancoFornecedor.delete(id);
    }

}
