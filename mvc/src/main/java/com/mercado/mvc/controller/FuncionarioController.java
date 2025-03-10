package com.mercado.mvc.controller;

import com.mercado.mvc.banco.BancoFornecedor;
import com.mercado.mvc.banco.BancoFuncionario;
import com.mercado.mvc.model.Fornecedor;
import com.mercado.mvc.model.Funcionario;

import java.util.List;

public class FuncionarioController {
    BancoFuncionario bancoFuncionario = new BancoFuncionario();

    public List<Funcionario> pegarTodosOsFuncionarios() {
        return bancoFuncionario.findAll();
    }

    public void adicionarFuncionario(Funcionario fun) {
        bancoFuncionario.insert(fun);
    }

    public boolean atualizarFuncionario(Funcionario fun) {
        return bancoFuncionario.update(fun);
    }

    public boolean removerFuncionario(Long id) {
        return bancoFuncionario.delete(id);
    }
    public boolean procurarId(Long id){
        return bancoFuncionario.delete(id);
    }
}
