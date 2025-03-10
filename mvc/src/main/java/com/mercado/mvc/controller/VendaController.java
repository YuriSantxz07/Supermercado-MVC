package com.mercado.mvc.controller;

import com.mercado.mvc.banco.BancoFornecedor;
import com.mercado.mvc.banco.BancoVendas;
import com.mercado.mvc.model.Fornecedor;
import com.mercado.mvc.model.Venda;

import java.util.List;

public class VendaController {
    BancoVendas bancoVendas = new BancoVendas();

    public List<Venda> pegarTodosOsVendas() {
        return bancoVendas.findAll();
    }

    public void adicionarVenda(Venda v) {
        bancoVendas.insert(v);
    }

    public boolean atualizarVenda(Venda v) {
        return bancoVendas.update(v);
    }

    public boolean removerVenda(Long id) {
        return bancoVendas.delete(id);
    }
    public boolean procurarId(Long id){
        return bancoVendas.delete(id);
    }
}
