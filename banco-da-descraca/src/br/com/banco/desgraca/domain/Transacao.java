package br.com.banco.desgraca.domain;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transacao {

    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private TipoTransacao tipoTransacao;
    private LocalDate dataTransacao;
    private Double valorTransacao;



    public Transacao(TipoTransacao tipoTransacao, LocalDate dataTransacao, Double valorTransacao) {
        this.tipoTransacao = tipoTransacao;
        this.dataTransacao = dataTransacao;
        this.valorTransacao = valorTransacao;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }

    @Override
    public String toString() {
        return String.format("\t%s * \t%s * \t%s",
                this.tipoTransacao.getSimboloTransacao(),
                DecimalFormat.getCurrencyInstance().format(this.valorTransacao),
                dataTransacao.format(FORMATO));
    }
}
