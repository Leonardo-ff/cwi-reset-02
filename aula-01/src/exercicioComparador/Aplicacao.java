package exercicioComparador;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero 1: ");
        int n1 = in.nextInt();

        System.out.println("Digite o numero 2: ");
        int n2 = in.nextInt();

        Comparador comparador = new Comparador();

        System.out.println(comparador.MenorQue(n1, n2));

        in.close();
    }
}
