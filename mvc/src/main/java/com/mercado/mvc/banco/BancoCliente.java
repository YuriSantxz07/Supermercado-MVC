package com.mercado.mvc.banco;

import com.mercado.mvc.model.Cliente;
import com.mercado.mvc.model.Fornecedor;

import java.util.ArrayList;
import java.util.List;

public class BancoCliente {
    private final List<Cliente> clientes = new ArrayList<>();

    public void insert(Cliente c) {
        clientes.add(c);
    }

    public Cliente procurarId(Long id) {
        return clientes.stream()
                .filter(f -> f.getIdCliente().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    public boolean update(Cliente c) {
        int index = clientes.indexOf(procurarId(c.getIdCliente()));
        if (index != -1) {
            clientes.set(index, c);
            return true;
        }
        return false;
    }

    public boolean delete(Long id) {
        return clientes.removeIf(f -> f.getIdCliente().equals(id));
    }
}
