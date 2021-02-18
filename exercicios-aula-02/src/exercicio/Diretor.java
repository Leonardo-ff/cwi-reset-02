package exercicio;

public class Diretor extends Pessoa{

    private int numeroDeFilmesDirigidos;


    public Diretor(String nome, int idade, Genero genero, int numeroDeFilmesDirigidos) {
        super(nome, idade, genero);
        this.numeroDeFilmesDirigidos = numeroDeFilmesDirigidos;
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
