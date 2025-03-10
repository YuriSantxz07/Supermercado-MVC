package com.mercado.mvc.view;

import com.mercado.mvc.controller.FornecedorController;
import com.mercado.mvc.model.Fornecedor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorView {
    FornecedorController fc = new FornecedorController();

    @GetMapping
    public List<Fornecedor> getAllFornecedores() {
        return fc.pegarTodosOsFornecedores();
    }

    @PostMapping
    public void addFornecedor(@RequestBody Fornecedor f) {
        fc.adicionarFornecedor(f);
    }

    @PutMapping
    public boolean updateFornecedor(@RequestBody Fornecedor f) {
        return fc.atualizarFornecedor(f);
    }

    @DeleteMapping("/{id}")
    public boolean deleteFornecedor(@RequestParam Long id) {
        return fc.removerFornecedor(id);
    }
    @GetMapping("/{id}")
    public boolean procurarFornecedor(@RequestParam Long id) {
        return fc.procurarId(id);
    }
}
