
public abstract class Imovel {

    protected Endereco endereco;
    protected Double valor;

    public Imovel(Endereco endereco, Double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Double getValor() {
        return valor;
    }

    public String apresentacao(){
        return "Imovel localizado em " + this.endereco.getLogradouro() + ", " + this.endereco.getNumero() + " "
                + this.endereco.getComplemento() + " no bairro " + this.endereco.getBairro() + " - "
                + this.endereco.getCidade() + " - " + this.endereco.getEstado().getDescricao() + ".\nNo Valor de R$ " +
                valor;
    }
}
