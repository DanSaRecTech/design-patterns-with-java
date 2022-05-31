package modal.situacao;

import modal.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{

    private BigDecimal setDescontoExtraEmAnalise(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }

    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }
}
