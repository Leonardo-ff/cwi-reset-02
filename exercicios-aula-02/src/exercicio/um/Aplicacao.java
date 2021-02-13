package exercicio.um;

public class Aplicacao {

    public static void main(String[] args) {

        Filme filme1 = new Filme("Shreck", "Aventuras de um ogro em um mundo encantado", "100", 5.0,
                "Joao", 30, 2);

        Filme filme2 = new Filme("Matrix", "Ficção cientifica", "120", 5.0, "Lana Wachowiski",
                50, 3);

        System.out.println(filme1.reproducao());

        System.out.println(filme2.reproducao());
    }
}
