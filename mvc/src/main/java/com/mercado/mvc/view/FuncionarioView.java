package com.mercado.mvc.view;

import com.mercado.mvc.controller.ClienteController;
import com.mercado.mvc.controller.FuncionarioController;
import com.mercado.mvc.model.Cliente;
import com.mercado.mvc.model.Funcionario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioView {

    FuncionarioController funC = new FuncionarioController();

    @GetMapping
    public List<Funcionario> getAllFuncionario() {
        return funC.pegarTodosOsFuncionarios();
    }

    @PostMapping
    public void addFuncionario(@RequestBody Funcionario fun) {
        funC.adicionarFuncionario(fun);
    }

    @PutMapping
    public boolean updateFuncionario(@RequestBody Funcionario fun) {
        return funC.atualizarFuncionario(fun);
    }

    @DeleteMapping("/{id}")
    public boolean deleteFuncionario(@RequestParam Long id) {
        return funC.removerFuncionario(id);
    }
    @GetMapping("/{id}")
    public boolean procurarFuncionario(@RequestParam Long id) {
        return funC.procurarId(id);
    }
}
