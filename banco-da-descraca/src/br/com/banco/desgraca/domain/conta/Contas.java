package br.com.banco.desgraca.domain.conta;


import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.SaqueException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Contas implements ContaBancaria{

    private Integer numeroConta;
    private Double saldoConta;
    private InstituicaoBancaria instituicaoBancaria;
    private List<Transacao> transacoes;



    public Contas(Integer numeroConta, InstituicaoBancaria instituicaoBancaria) {
        this.numeroConta = numeroConta;
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldoConta = 0.0d;
        this.transacoes = new ArrayList<Transacao>();
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return this.instituicaoBancaria;
    }

    @Override
    public Double consultarSaldo() {
        return this.saldoConta;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    @Override
    public void depositar(Double valor){
        registrarTransacao(new Transacao(TipoTransacao.DEPOSITO, Data.getDataTransacao(), valor));
        this.saldoConta += valor;
        System.out.printf("Depositando valor %s na Conta Digital %s %d\n",
                DecimalFormat.getCurrencyInstance().format(valor),
                this.instituicaoBancaria.getBanco(), this.numeroConta);
    }

    @Override
    public void sacar(Double valor) {
        if(valor > this.saldoConta){
            throw new SaldoInsuficienteException("Saldo Insuficiente para realização de saque\n");
        } else {
            registrarTransacao(new Transacao(TipoTransacao.SAQUE, Data.getDataTransacao(), valor));
            this.saldoConta -= valor;
            System.out.printf("Sacando o valor de %s da Conta Digital %s %d\n",
                    DecimalFormat.getCurrencyInstance().format(valor),
                    this.instituicaoBancaria.getBanco(), this.numeroConta);
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if(valor > this.saldoConta){
            throw new SaqueException("Saldo Insuficiente para realização da transferencia\n");
        } else{
            registrarTransacao(new Transacao(TipoTransacao.TRANSFERENCIA, Data.getDataTransacao(), valor));
            this.saldoConta -= valor;
            contaDestino.depositar(valor);
            System.out.printf("Transferindo o valor de %s da Conta Digital %s %d para a Conta %s %d\n",
                    DecimalFormat.getCurrencyInstance().format(valor),
                    this.instituicaoBancaria.getBanco(), this.numeroConta,
                    contaDestino.getInstituicaoBancaria().getBanco(),
                    contaDestino);
        }
    }

    private List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void registrarTransacao(Transacao transacao){
        this.transacoes.add(transacao);
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        System.out.printf("----- EXTRATO %s ----\n", this.toString());
        if(inicio != null && fim == null){
            for (Transacao transacao: transacoes) {
                if(transacao.getDataTransacao().isEqual(inicio) || transacao.getDataTransacao().isAfter(inicio) ){
                    System.out.println(transacao);
                }
            }
        } else if(inicio == null && fim != null){
            for (Transacao transacao: transacoes) {
                if(transacao.getDataTransacao().isEqual(fim) || transacao.getDataTransacao().isBefore(fim) ){
                    System.out.println(transacao);
                }
            }
        } else if(inicio != null && fim != null){
            for(Transacao transacao: transacoes){
                if (transacao.getDataTransacao().isEqual(inicio) ||
                        transacao.getDataTransacao().isAfter(inicio) ||
                        transacao.getDataTransacao().isBefore(fim) ||
                        transacao.getDataTransacao().isEqual(fim)) {

                    System.out.println(transacao);
                }
            }
        } else{
            for(Transacao transacao: transacoes){
                System.out.println(transacao);
            }
        }
    }
    //TODO função toString
}
