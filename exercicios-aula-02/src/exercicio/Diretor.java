package exercicio;

public class Diretor {

    private String nome;
    private int idade;
    private int numeroDeFilmesDirigidos;
    private Genero genero;

    public Diretor(String nome) {
        this.nome = nome;

    }

    public Diretor(String nome, int idade, int numeroDeFilmesDirigidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDeFilmesDirigidos = numeroDeFilmesDirigidos;
        this.genero = genero;
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

    public void exibirDiretor(){
        System.out.println("Dados do Diretor");
        System.out.println("---Nome: " + this.nome);
        System.out.println("---Idade: " + this.idade);
        System.out.println("---Genero: " + this.genero.getDescricao());
    }
}
