package exercicio;

public class Pessoa {

    private String nome;
    private int idade;
    private Genero genero;

    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void exibirInfo(){
        System.out.println("---Nome: " + this.nome);
        System.out.println("---Idade: " + this.idade);
        System.out.println("---Genero: " + this.genero.getDescricao());
    }

}
