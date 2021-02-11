package exercicioNotasAluno;

public class Aplicacao {

    public static void main(String[] args) {

        Aluno alunoUm = new Aluno("Leonardo");

        int nota1 = 10;
        int nota2 = 7;
        int nota3 = 6;

        float media = alunoUm.mediaFinal(nota1, nota2, nota3);
        alunoUm.avaliacao(media);

        System.out.println("Nome do Aluno: " + alunoUm.getNomeAluno());
        System.out.printf("Média: %.2f\n", alunoUm.getNotaFinal());
        System.out.println("Aprovado? " + alunoUm.isAprovado());

    }
}
