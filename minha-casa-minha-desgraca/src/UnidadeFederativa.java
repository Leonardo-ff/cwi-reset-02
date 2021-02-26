public enum UnidadeFederativa {
    AC("Acre"),
    AL("Alagoas"),
    AM("Amazonas"),
    AP("Amapá"),
    BA("Bahia"),
    CE("Ceara"),
    DF("Distrito Federal"),
    ES("Espírito Santo"),
    GO("Goiás"),
    MA("Maranhão"),
    MG("Minas Gerais"),
    MS("Mato Grosso do Sul"),
    MT("Mato Grosso"),
    PA("Pará"),
    PB("Paraíba"),
    PE("Pernambuco"),
    PI("Piauí"),
    PR("Paraná"),
    RJ("Rio de Janeiro", 0.6),
    RN("Rio Grande do Norte"),
    RO("Rondônia"),
    RR("Roraima"),
    RS("Rio Grande do Sul"),
    SC("Santa Catarina"),
    SE("Sergipe"),
    SP("São Paulo", 0.65),
    TO("Tocantins");

    private String descricao;
    private Double percentualPagamento;

    UnidadeFederativa(String descricao) {
        this(descricao, 0.5);
    }

    UnidadeFederativa(String descricao, Double percentualPagamento) {
        this.descricao = descricao;
        this.percentualPagamento = percentualPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPercentualPagamento() {
        return percentualPagamento;
    }
}
