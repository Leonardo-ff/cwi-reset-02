package exercicio;

public class Ator {

    private String nome;
    private Integer idade;
    private Integer numeroDeOscarVencidos;
    private Genero genero;

    public Ator(String nome, Integer idade, Integer numeroDeOscarVencidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDeOscarVencidos = numeroDeOscarVencidos;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getNumeroDeOscarVencidos() {
        return numeroDeOscarVencidos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void exibirAtor(){
        System.out.println("Dados do Ator/Atriz Principal");
        System.out.println("---Nome: " + this.nome);
        System.out.println("---Idade: " + this.idade);
        System.out.println("---Genero: " + this.genero.getDescricao());
    }
}
