package exercicioCalculadora;

public class Aplicacao {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();


        System.out.println("A Soma: " + calculadora.Soma(20,30));
        System.out.println("A Subtração: " + calculadora.Substrair(20,30));
        System.out.println("A Divisão: " + calculadora.Divisao(20,30));
        System.out.println("A Multiplicação: " + calculadora.Multiplicar(20,30));
    }
}
