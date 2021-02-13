package exercicio.um;

//Classe criada, mas no momento de sua utilizacao surgiram duvidas, então prefiri deixa-la de fora.
public class Diretor {

    private String nome;
    private int idade;
    private int numeroDeFilmesDirigidos;

    public Diretor(String nome) {
        this.nome = nome;

    }

    public Diretor(String nome, int idade, int numeroDeFilmesDirigidos) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDeFilmesDirigidos = numeroDeFilmesDirigidos;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroDeFilmesDirigidos() {
        return numeroDeFilmesDirigidos;
    }
}
