package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.Contas;

import java.time.LocalDate;

public class BancoDaDescraca {

    public static void main(String[] args) throws Exception {

        Contas conta1 = new ContaCorrente(123, InstituicaoBancaria.ITAU);

        System.out.println(conta1.toString());
        System.out.println(conta1.consultarSaldo());



    }
}
