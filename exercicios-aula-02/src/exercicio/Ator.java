package exercicio;

import java.time.LocalDate;

public class Ator extends Pessoa{

    private Integer numeroDeOscarVencidos;

    public Ator(String nome, LocalDate dataDeNascimento, Genero genero, Integer numeroDeOscarVencidos) {
        super(nome, dataDeNascimento, genero);
        this.numeroDeOscarVencidos = numeroDeOscarVencidos;
    }

    public Integer getNumeroDeOscarVencidos() {
        return numeroDeOscarVencidos;
    }

    @Override
    public void exibirInfo(){
        System.out.println("ATOR/ ATRIZ");
        super.exibirInfo();
        System.out.println("-Numero de Oscars conquistados: " + this.numeroDeOscarVencidos);
    }
}
