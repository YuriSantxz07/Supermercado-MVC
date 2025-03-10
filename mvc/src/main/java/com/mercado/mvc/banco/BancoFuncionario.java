package com.mercado.mvc.banco;

import com.mercado.mvc.model.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class BancoFuncionario {
    private final List<Funcionario> funcionarios = new ArrayList<>();

    public void insert(Funcionario f) {
        funcionarios.add(f);
    }

    public List<Funcionario> findAll() {
        return new ArrayList<>(funcionarios);
    }

    public Funcionario procurarId(Long id) {
        return funcionarios.stream()
                .filter(f -> f.getIdFuncionario().equals(id))
                .findFirst()
                .orElse(null);
    }

    public boolean update(Funcionario f) {
        int index = funcionarios.indexOf(procurarId(f.getIdFuncionario()));
        if (index != -1) {
            funcionarios.set(index, f);
            return true;
        }
        return false;
    }

    public boolean delete(Long id) {
        return funcionarios.removeIf(f -> f.getIdFuncionario().equals(id));
    }
}
