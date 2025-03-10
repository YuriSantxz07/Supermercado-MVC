package com.mercado.mvc.view;

import com.mercado.mvc.controller.ProdutoController;
import com.mercado.mvc.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoView {

    ProdutoController pc = new ProdutoController();

    @GetMapping
    public List<Produto> getAllProduto() {
        return pc.pegarTodosOsProdutos();
    }

    @PostMapping
    public void addProduto(@RequestBody Produto p) {
        pc.adicionarProduto(p);
    }

    @PutMapping
    public boolean updateProduto(@RequestBody Produto p) {
        return pc.atualizarProduto(p);
    }

    @DeleteMapping("/{id}")
    public boolean deleteProduto(@RequestParam Long id) {
        return pc.removerProduto(id);
    }
    @GetMapping("/{id}")
    public boolean procurarProduto(@RequestParam Long id) {
        return pc.procurarId(id);
    }
}
