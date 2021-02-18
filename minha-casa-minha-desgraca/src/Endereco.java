public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String Bairro;
    private String cidade;
    private UnidadeFederativa estado;

    public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, UnidadeFederativa estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        Bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public UnidadeFederativa getEstado() {
        return estado;
    }

    /*public String EnderecoCompleto(){
        return
        System.out.println("Logradouro: " + getLogradouro());
        System.out.println("Numero: " + getNumero() + " Complemento: " + getComplemento());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Cidade: " + getCidade() + " - " + getEstado());
    */
}