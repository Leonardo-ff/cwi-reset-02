package br.com.cwi.reset.exemploreset;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWolrdController {

    private static String mensagem = "Hello World";

    @GetMapping("/hello-world")
    public String helloWorld(){
        return mensagem;
    }

    @PutMapping("/hello-world/{novaMensagem}")
    public String mudarMensagem(@PathVariable String novaMensagem){
        this.mensagem = novaMensagem;
        return mensagem;
    }

    @DeleteMapping("/hello-world")
    public void excluirMensagem(){
        this.mensagem = null;
    }

}
