package exercicio;

public class Aplicacao {

    public static void main(String[] args) {

        Diretor diretorTenet = new Diretor("Christopher Nolan", 50, Genero.MASCULINO, 13);
        Ator atorTenet = new Ator("John David Washington", 36, Genero.MASCULINO, 0);

        Filme filme1 = new Filme("Tenet", "Um agente secreto embarca em uma missão perigosa para \n" +
                "evitar o início da Terceira Guerra Mundial.", "230", 9.0,
                diretorTenet, atorTenet);

        Diretor diretorAProcuraDaFelicidade = new Diretor("Gabriele Muccino",53, Genero.MASCULINO,
                12);
        Ator atorAProcuraDaFelicidade = new Ator("Will Smith", 52, Genero.MASCULINO, 0);

        Filme filme2 = new Filme("À Procura da Felicidade",
                "Chris enfrenta sérios problemas financeiros e Linda, sua esposa, decide partir. \n" +
                        "Ele agora é pai solteiro e precisa cuidar de Christopher, seu filho de 5 anos. Chris \n" +
                        "tenta usar sua habilidade como vendedor para conseguir um emprego melhor, mas só consegue \n" +
                        "um estágio não remunerado. Seus problemas financeiros não podem esperar uma promoção e eles \n" +
                        "acabam despejados. Chris e Christopher passam a dormir em abrigos ou onde quer que consigam \n" +
                        "um refúgio, mantendo a esperança de que dias melhores virão.", "157",
                77.0, diretorAProcuraDaFelicidade, atorAProcuraDaFelicidade);

        filme1.reproducao();

        filme2.reproducao();
    }
}
