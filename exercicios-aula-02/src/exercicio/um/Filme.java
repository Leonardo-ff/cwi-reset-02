package exercicio.um;

public class Filme {

    private String nome;
    private String descricaoFilme;
    private String duracao;
    private double avaliacao;
    private String nomeDiretor;
    private int idadeDiretor;
    private int numeroFilmes;

    public Filme(String nome, String descricaoFilme, String duracao, double avaliacao, String nomeDiretor, int idadeDiretor, int numeroFilmes) {
        this.nome = nome;
        this.descricaoFilme = descricaoFilme;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.numeroFilmes = numeroFilmes;
    }

    public String reproducao(){
        return "Filme: " + this.nome + "\n" + "Descrição: " + this.descricaoFilme + "\n" + "Duração: " + this.duracao
                + "\n" + "Nome Diretor: " + this.nomeDiretor + "\n";
    }
}
