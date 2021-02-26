public class Casa extends Imovel{

    private String patio;

    public Casa(Endereco endereco, Double valor, String patio) {
        super(endereco, valor);
        this.patio = patio;
    }

    public String getPatio() {
        return patio;
    }

    public String apresentacao(){
        return "Casa localizada em " + this.endereco.getLogradouro() + ", " + this.endereco.getNumero() + " "
                + this.endereco.getComplemento() +" no bairro " +
                this.endereco.getBairro() + " - " + this.endereco.getCidade() + "/ " + this.endereco.getEstado().getDescricao() +
                ". Com patio?" + this.patio + ".\nNo Valor de R$ " + this.valor.toString();
    }

}
