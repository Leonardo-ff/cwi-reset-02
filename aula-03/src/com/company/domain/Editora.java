package com.company.domain;

import com.company.exceptions.EditoraException;

public class Editora {

    private String nome;
    private String localizacao;

    public Editora(String nome, String localizacao) {
        verificaEditora(nome);
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    private void verificaEditora(String nome){
        // EditoraException é uma sobreescrita do metod de RuntimeException, definido em outra "classe"
        if(nome.equals("DC Comics")){
            throw new EditoraException("Não pode ser Instanciado com o nome DC Comics!!!");
        }
    }
}

