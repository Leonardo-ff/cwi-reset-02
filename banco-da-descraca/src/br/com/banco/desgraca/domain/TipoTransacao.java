package br.com.banco.desgraca.domain;

public enum TipoTransacao {

    DEPOSITO(" + "),
    SAQUE(" - "),
    TRANSFERENCIA(" - ");

    private final String simboloTransacao;

    TipoTransacao(String simboloTransacao) {
        this.simboloTransacao = simboloTransacao;
    }

    public String getSimboloTransacao() {
        return simboloTransacao;
    }
}
