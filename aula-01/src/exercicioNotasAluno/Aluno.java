package exercicioNotasAluno;

public class Aluno {

    private String nomeAluno;
    private float notaFinal;
    private boolean aprovado;

    Aluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public float mediaFinal(int nota1, int nota2, int nota3){

        this.notaFinal = (float)(nota1 + nota2 + nota3) / 3 ;
        return notaFinal;
    }

    public void avaliacao(float notaFinal){

        if(this.notaFinal<=10.0 && this.notaFinal>= 7.0){
            this.aprovado = true;

        } else{
            this.aprovado = false;
        }
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public boolean isAprovado() {
        return aprovado;
    }
}
