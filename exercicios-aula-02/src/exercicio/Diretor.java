package exercicio;

public class Diretor extends Pessoa{

    private Integer numeroDeFilmesDirigidos;


    public Diretor(String nome, int idade, Genero genero, Integer numeroDeFilmesDirigidos) {
        super(nome, idade, genero);
        this.numeroDeFilmesDirigidos = numeroDeFilmesDirigidos;
    }

    public int getNumeroDeFilmesDirigidos() {
        return numeroDeFilmesDirigidos;
    }

    @Override
    public void exibirInfo(){
        System.out.println("DIRETOR: ");
        super.exibirInfo();
        System.out.println("-Numero de Filmes dirigidos: " + numeroDeFilmesDirigidos);
    }
}
