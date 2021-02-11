package oo;

public class Carro {

    private String marca;

    private String modelo;

    private int ano;

    private int portas;

    private float quantidadeCombustivel;

    private boolean estacionado;

    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, int portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.portas = portas;

        System.out.println("");
    }

    void abastecer(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }


    void estacionar(){
        System.out.println("Estacionando o carro!" );
        this.estacionado = true;
    }

    void acelerar(int velocidadeDesejada){
        System.out.println("Acelerando na velocidade de " + velocidadeDesejada);

        this.estacionado = false;
        velocidadeAtual = velocidadeDesejada;
        this.quantidadeCombustivel -= velocidadeDesejada * 0.02;
    }

    boolean isEstacionado(){
        return estacionado;
    }




}
