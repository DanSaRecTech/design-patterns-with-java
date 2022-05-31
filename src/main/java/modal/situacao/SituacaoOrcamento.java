package modal.situacao;

import exception.DomainException;
import modal.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public void emAnalise(Orcamento orcamento) {
        throw new DomainException("Pedido não pode ficar em análise");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

    public void aprovado(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Pedido não pode ser finalizado!");
    }

    public BigDecimal calcularValorDescontoExtre(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
