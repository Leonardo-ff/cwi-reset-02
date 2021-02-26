package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.InstituicaoBancariaException;
import br.com.banco.desgraca.exception.SaqueException;

import java.time.LocalDate;

public class ContaDigital extends Contas{

    public ContaDigital(Integer numeroConta, InstituicaoBancaria instituicaoBancaria) {
        super(numeroConta, instituicaoBancaria);
        if(this.getInstituicaoBancaria() != instituicaoBancaria.NUBANK &&
                this.getInstituicaoBancaria() != instituicaoBancaria.ITAU){
            throw new InstituicaoBancariaException("Essa Instituiçao Financeira não permite Conta Digital" );
        }
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return super.getInstituicaoBancaria();
    }

    @Override
    public Double consultarSaldo() {
        return super.consultarSaldo();
    }

    @Override
    public void depositar(Double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(Double valor) {
        if(valor < 10.0D){
            throw new SaqueException("Valor não permitido! Saques igual ou acima de R$ 10,00!!");
        } else{
            super.sacar(valor);
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        super.transferir(valor, contaDestino);
    }

    @Override
    public void registrarTransacao(Transacao transacao) {
        super.registrarTransacao(transacao);
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        super.exibirExtrato(inicio, fim);
    }

    @Override
    public String toString() {
        return "Conta Digital " + this.getInstituicaoBancaria() + " " + this.getNumeroConta();
    }
}

