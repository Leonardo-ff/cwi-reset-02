package exercicio;

public class Diretor extends Pessoa{

    //private String nome;
    //private int idade;
    //private Genero genero;
    private int numeroDeFilmesDirigidos;


    public Diretor(String nome, int idade, Genero genero, int numeroDeFilmesDirigidos) {
        super(nome, idade, genero);
        //this.nome = nome;
        //this.idade = idade;
        //this.genero = genero;
        this.numeroDeFilmesDirigidos = numeroDeFilmesDirigidos;
    }

    public String getNome() {
        return super.getNome();
    }

    public int getIdade() {
        return super.getIdade();
    }

    public int getNumeroDeFilmesDirigidos() {
        return numeroDeFilmesDirigidos;
    }

    @Override
    public void exibirInfo(){
        System.out.println("-Dados Diretor");
        super.exibirInfo();
    }
}
