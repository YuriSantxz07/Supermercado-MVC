package com.mercado.mvc.view;

import com.mercado.mvc.controller.ClienteController;
import com.mercado.mvc.controller.FornecedorController;
import com.mercado.mvc.model.Cliente;
import com.mercado.mvc.model.Fornecedor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/clientes")
public class ClienteView {
    ClienteController cc = new ClienteController();

    @GetMapping
    public List<Cliente> getAllClientes() {
        return cc.pegarTodosOsClientes();
    }

    @PostMapping
    public void addCliente(@RequestBody Cliente c) {
        cc.adicionarCliente(c);
    }

    @PutMapping
    public boolean updateCliente(@RequestBody Cliente c) {
        return cc.atualizarCliente(c);
    }

    @DeleteMapping("/{id}")
    public boolean deleteCliente(@RequestParam Long id) {
        return cc.removerCliente(id);
    }
    @GetMapping("/{id}")
    public boolean procurarCliente(@RequestParam Long id) {
        return cc.procurarId(id);
    }
}
