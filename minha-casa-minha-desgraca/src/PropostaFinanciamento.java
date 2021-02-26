public class PropostaFinanciamento {

    private Beneficiario beneficiario;
    private Imovel imovel;
    private Integer prazoPagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, Integer prazoPagamento) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.prazoPagamento = prazoPagamento;
    }

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {
       /*
        Double deltaSalario = beneficiario.getSalario() * prazoPagamento;
        Double cinquentaPorCentoImovel = imovel.getValor() * 0.5;
        Double sessentaPorCentoImovel = imovel.getValor() * 0.6;
        Double sessentaCincoPorCentoImovel = imovel.getValor() * 0.65;

        if(imovel.getEndereco().getEstado() == UnidadeFederativa.SP && deltaSalario >= sessentaCincoPorCentoImovel){
            imprimirPropostaAprovada();
        } else if(imovel.getEndereco().getEstado() == UnidadeFederativa.RJ && deltaSalario >= sessentaPorCentoImovel){
            imprimirPropostaAprovada();
        } else if(deltaSalario >= cinquentaPorCentoImovel){
            imprimirPropostaAprovada();
        } else{
            imprimirPropostaNegada();
        }

        */

        Double capacidadePagamento = beneficiario.getSalario() * prazoPagamento;
        Double minimoParaPagamento = imovel.getValor() * imovel.getEndereco().getEstado().getPercentualPagamento();
        boolean propostaAprovada = capacidadePagamento >= minimoParaPagamento;

        if (propostaAprovada) {
            imprimirPropostaAprovada();
        } else {
            imprimirPropostaNegada();
        }
    }

    private void imprimirPropostaAprovada(){
        System.out.println("Parabéns! Proposta aprovada " + beneficiario.getNome() + " sobre" + imovel.apresentacao()
        + " com o prazo de " + this.prazoPagamento + " meses.");
    }

    private void imprimirPropostaNegada(){
        System.out.println("Não vai rolar "+ beneficiario.getNome() + ", proposta abaixo do minimo para o imovel " + imovel.apresentacao()
                + " com o prazo de " + this.prazoPagamento + " meses.");
    }

    private void imprimirPropostaPadrao() {
        System.out.println(" - Beneficiário: "+beneficiario.getNome());
        System.out.println(" - Imóvel: "+imovel.apresentacao());
        System.out.println(" - Prazo da desgraça: "+prazoPagamento);
    }
}
