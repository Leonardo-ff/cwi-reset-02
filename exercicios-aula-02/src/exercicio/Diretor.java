package exercicio;

import java.time.LocalDate;

public class Diretor extends Pessoa{

    private Integer numeroDeFilmesDirigidos;


    public Diretor(String nome, LocalDate dataDeNascimento, Genero genero, Integer numeroDeFilmesDirigidos) {
        super(nome, dataDeNascimento, genero);
        this.numeroDeFilmesDirigidos = numeroDeFilmesDirigidos;
    }


    public int getNumeroDeFilmesDirigidos() {
        return numeroDeFilmesDirigidos;
    }

    @Override
    public void exibirInfo(){
        System.out.println("DIRETOR: ");
        super.exibirInfo();
        System.out.println("-Numero de Filmes dirigidos: " + this.numeroDeFilmesDirigidos);
    }
}
