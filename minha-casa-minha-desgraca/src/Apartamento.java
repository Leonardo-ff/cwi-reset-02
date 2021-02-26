
public class Apartamento extends Imovel{

    private String andar;

    public Apartamento(Endereco endereco, Double valor, String andarApartamento) {
        super(endereco, valor);
        this.andar = andarApartamento;
    }

    public String getAndar() {
        return andar;
    }

    @Override
    public String apresentacao(){
        return "Apartamento localizado em " + this.endereco.getLogradouro() + ", " + this.endereco.getNumero() + " "
                + this.endereco.getComplemento() + " " + this.andar + " andar," +" no bairro " +
                this.endereco.getBairro() + " - " + this.endereco.getCidade() + "/ " + this.endereco.getEstado().getDescricao() +
                ".\nNo Valor de R$ " + this.valor.toString();
    }
}
