package exercicio;

public class Filme {

    private String nome;
    private String descricaoFilme;
    private String duracao;
    private double avaliacao;
    private Diretor diretor;
    private Ator atorPrincipal;


    public Filme(String nome, String descricaoFilme, String duracao, double avaliacao, Diretor diretor, Ator atorPrincipal) {
        this.nome = nome;
        this.descricaoFilme = descricaoFilme;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
    }

    public void reproducao(){
        System.out.println("Filme: " + this.nome);
        System.out.println("Descrição: " + this.descricaoFilme);
        System.out.println("Duração: " + this.duracao);
        diretor.exibirInfo();
        atorPrincipal.exibirInfo();
        System.out.println();
    }
}
