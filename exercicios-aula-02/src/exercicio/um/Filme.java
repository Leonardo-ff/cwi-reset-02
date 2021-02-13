package exercicio.um;

public class Filme {

    private String nome;
    private String descricaoFilme;
    private String duracao;
    private double avaliacao;
    private Diretor diretor;

    public Filme(String nome, String descricaoFilme, String duracao, double avaliacao, Diretor diretor) {
        this.nome = nome;
        this.descricaoFilme = descricaoFilme;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }

    public void reproducao(){
        System.out.println("Filme: " + this.nome);
        System.out.println("Descrição: " + this.descricaoFilme);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Nome Diretor: " + this.diretor.getNome());
        System.out.println();
    }
}
