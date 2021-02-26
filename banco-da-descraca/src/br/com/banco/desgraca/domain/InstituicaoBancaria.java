package br.com.banco.desgraca.domain;

public enum InstituicaoBancaria {
    BANCO_DO_BRASIL("Banco do Braisl"),
    BRADESCO("Bradesco"),
    CAIXA("Caixa Econômica"),
    ITAU("Banco Itaú"),
    NUBANK("Banco NuBank");

    private String banco;

    InstituicaoBancaria(String banco) {
        this.banco = banco;
    }

    public String getBanco() {
        return banco;
    }
}
