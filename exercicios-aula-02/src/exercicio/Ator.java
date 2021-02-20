package exercicio;

public class Ator extends Pessoa{

    private Integer numeroDeOscarVencidos;

    public Ator(String nome, Integer idade, Genero genero, Integer numeroDeOscarVencidos) {
        super(nome, idade, genero);
        this.numeroDeOscarVencidos = numeroDeOscarVencidos;
    }

    public Integer getNumeroDeOscarVencidos() {
        return numeroDeOscarVencidos;
    }

    @Override
    public void exibirInfo(){
        System.out.println("ATOR/ ATRIZ");
        super.exibirInfo();
        System.out.println("-Numero de Oscars conquistados: " + numeroDeOscarVencidos);
    }
}
