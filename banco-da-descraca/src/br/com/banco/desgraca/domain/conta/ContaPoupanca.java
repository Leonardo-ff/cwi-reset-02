package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

import java.time.LocalDate;

public class ContaPoupanca extends Contas{

    public ContaPoupanca(Integer numeroConta, InstituicaoBancaria instituicaoBancaria) {
        super(numeroConta, instituicaoBancaria);
    }

    @Override
    public void sacar(Double valor) {
        super.sacar(valor);
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        super.transferir(valor, contaDestino);
    }


    @Override
    public String toString() {
        return "Conta Poupança " + this.getInstituicaoBancaria() + " " + this.getNumeroConta();
    }
}
