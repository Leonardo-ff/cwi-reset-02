package exercicio;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataDeNascimento;
    private Genero genero;

    public Pessoa(String nome, LocalDate dataDeNascimento, Genero genero) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void exibirInfo(){
        System.out.println("-Nome: " + this.nome);
        System.out.println("-Idade: " + Period.between(dataDeNascimento, LocalDate.now()).getYears());
        System.out.println("-Genero: " + this.genero.getDescricao());
    }

}
