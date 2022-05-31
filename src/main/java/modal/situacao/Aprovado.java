package modal.situacao;

import modal.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    private BigDecimal setDescontoExtraAprovado(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
