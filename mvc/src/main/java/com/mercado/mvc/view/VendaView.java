package com.mercado.mvc.view;

import com.mercado.mvc.controller.VendaController;
import com.mercado.mvc.model.Venda;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class VendaView {
    VendaController vc = new VendaController();

    @GetMapping
    public List<Venda> getAllVendas() {
        return vc.pegarTodosOsVendas();
    }

    @PostMapping
    public void addVenda(@RequestBody Venda v) {
        vc.adicionarVenda(v);
    }

    @PutMapping
    public boolean updateVenda(@RequestBody Venda v) {
        return vc.atualizarVenda(v);
    }

    @DeleteMapping
    public boolean deleteVenda(@RequestParam Long id) {
        return vc.removerVenda(id);
    }
    @GetMapping("/{id}")
    public boolean procurarProduto(@RequestParam Long id) {
        return vc.procurarId(id);
    }
}
