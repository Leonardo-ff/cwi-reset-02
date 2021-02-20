package exercicio;

import java.util.List;

public class Filme {

    private String nome;
    private String descricaoFilme;
    private String duracao;
    private double avaliacao;
    //private Diretor diretor;
    //private Ator atorPrincipal;
    private List<Pessoa> elenco;

    public Filme(String nome, String descricaoFilme, String duracao, double avaliacao, List<Pessoa> elenco) {
        defineAvaliacao(avaliacao);
        this.nome = nome;
        this.descricaoFilme = descricaoFilme;
        this.duracao = duracao;
        //this.diretor = diretor;
        //this.atorPrincipal = atorPrincipal;
        this.elenco = elenco;
    }


    public void reproducao(){
        System.out.println("Filme: " + this.nome);
        System.out.println("Descrição: " + this.descricaoFilme);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Nota Avaliação: " + this.avaliacao);
        creditosFilme();
        //diretor.exibirInfo();
        //atorPrincipal.exibirInfo();
        System.out.println();
    }

    private void defineAvaliacao(double avaliacao){

        if(avaliacao > 5.0 || avaliacao< 1.0){
            this.avaliacao = 3.0;
        } else{
            this.avaliacao = avaliacao;
        }

    }

    private void creditosFilme(){
        System.out.println("---ELENCO---");
        for(Pessoa pessoa: elenco){
            pessoa.exibirInfo();
        }
    }
}
