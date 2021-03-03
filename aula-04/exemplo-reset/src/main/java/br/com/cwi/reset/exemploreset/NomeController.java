package br.com.cwi.reset.exemploreset;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nome")
public class NomeController {

    private static String nome = "Leonardo";

    @GetMapping()
    public String getNome(){
        return nome;
    }

    @PutMapping("/{novoNome}")
    public String putNome(@PathVariable("nome") String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    @DeleteMapping()
    public void deleteNome(){
        this.nome = null;
    }
}
