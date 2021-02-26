package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.SaqueException;
import com.sun.istack.internal.NotNull;

public class ContaCorrente extends Contas{

    private static final Double TAXA_PARA_SAQUE = 0.01d;

    public ContaCorrente(Integer numeroConta, InstituicaoBancaria instituicaoBancaria) {
        super(numeroConta, instituicaoBancaria);
    }

    @Override
    public void sacar(Double valor) {
        if(valor % 5 != 0.00d){
            throw new SaqueException("Operação Invalida! Sò pode ser feito saques com notas de R$5,00 " +
                    "R$10,00 / R$20,00 / R$50,00 / R$100,00 / R$200,00");
        } else{
            super.sacar(valor);
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if(contaDestino.getInstituicaoBancaria() != this.getInstituicaoBancaria()){
            Double descontoTaxa = valor * TAXA_PARA_SAQUE;
            this.sacar(valor);
            this.sacar(descontoTaxa);
            contaDestino.depositar(valor);
            registrarTransacao(new Transacao(TipoTransacao.TRANSFERENCIA, Data.getDataTransacao(), valor));
        } else{
            super.transferir(valor, contaDestino);
        }
    }

    //TODO função toString


    @Override
    public String toString() {
        return "Conta Corrente " + this.getInstituicaoBancaria() + " " + this.getNumeroConta();
    }
}
