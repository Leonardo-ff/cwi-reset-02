package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.Contas;

import java.time.LocalDate;

public class BancoDaDescraca {

    public static void main(String[] args) throws Exception {

        Contas conta1 = new ContaCorrente(123, InstituicaoBancaria.ITAU);

        conta1.depositar(100.0);
        conta1.sacar(10.00);
        System.out.println(conta1.toString());
        System.out.println(conta1.consultarSaldo());
        conta1.exibirExtrato(null,LocalDate.of(2020,07,8));

        //conta1.sacar(3.00); -> teste de exception

        conta1.sacar(15.00);
        System.out.println(conta1.consultarSaldo());
        conta1.sacar(75.0);
        System.out.println(conta1.consultarSaldo());

        conta1.exibirExtrato(null,null);

        //conta1.sacar(10.0); conta1 zerada -> exception Saldo Insuficiente

        //EXCPETIONS Instituicao Financeira
        //Contas conta2 = new ContaDigital(222,InstituicaoBancaria.BANCO_DO_BRASIL);
        //Contas conta3 = new ContaDigital(222,InstituicaoBancaria.BRADESCO);
        //Contas conta4 = new ContaDigital(222,InstituicaoBancaria.CAIXA);




    }
}
