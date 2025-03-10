package com.mercado.mvc.controller;

import com.mercado.mvc.banco.BancoCliente;
import com.mercado.mvc.banco.BancoFornecedor;
import com.mercado.mvc.model.Cliente;
import com.mercado.mvc.model.Fornecedor;

import java.util.List;

public class ClienteController {
    BancoCliente bancoCliente = new BancoCliente();

    public List<Cliente> pegarTodosOsClientes() {
        return bancoCliente.findAll();
    }

    public void adicionarCliente(Cliente c) {
        bancoCliente.insert(c);
    }

    public boolean atualizarCliente(Cliente c) {
        return bancoCliente.update(c);
    }

    public boolean removerCliente(Long id) {
        return bancoCliente.delete(id);
    }
    public boolean procurarId(Long id){
        return bancoCliente.delete(id);
    }
}
