package modal;

import lombok.Builder;
import lombok.Data;
import modal.situacao.EmAnalise;
import modal.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

@Builder
@Data
public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens, SituacaoOrcamento situacao) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {

        var valorDoDescontoExtra = this.situacao.calcularValorDescontoExtre(this);
        this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovado(this);
    }

    public void reprovado() {
        this.situacao.reprovar(this);
    }

    public void finalizado() {
        this.situacao.finalizar(this);
    }
}
