package modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@Data
public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private String situacao;

    public void aplicarDescontoExtra() {

        var valorDoDescontoExtra = BigDecimal.ZERO;
        if (situacao.equals("EM_ANALISE")) {
            valorDoDescontoExtra = new BigDecimal("0.05");
        }

        if (situacao.equals("APROVADO")) {
            valorDoDescontoExtra = new BigDecimal("0.02");
        }
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }
}
