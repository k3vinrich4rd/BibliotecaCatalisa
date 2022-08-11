package Biblioteca.Catalisa.Biblioteca.controller;

import Biblioteca.Catalisa.Biblioteca.model.LivrosModel;
import Biblioteca.Catalisa.Biblioteca.service.LivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LivrosController {


    @Autowired
    private LivrosService livrosService;


    @GetMapping(path = "/biblioteca")
    public List<LivrosModel> buscarTodosLivros() {
        return livrosService.exibirLivros();
    }

    @GetMapping(path = "/biblioteca/{codigo}")
    public Optional<LivrosModel> buscarPorId(@PathVariable Long codigo) {
        return livrosService.buscarId(codigo);
    }

    @PostMapping(path = "/biblioteca")
    @ResponseStatus(HttpStatus.CREATED)
    public LivrosModel cadastrarLivro(@RequestBody LivrosModel livrosModel) {
        return livrosService.cadastrarLivro(livrosModel);
    }

    @PutMapping(path = "/biblioteca/{codigo}")
    public LivrosModel alteraLivro(@RequestBody LivrosModel livrosModel) {
        return livrosService.alterarLivro(livrosModel);
    }

    @DeleteMapping(path = "biblioteca/{codigo}")
    public void deletarProdutos(@PathVariable Long codigo) {
        livrosService.deletar(codigo);
    }
}
