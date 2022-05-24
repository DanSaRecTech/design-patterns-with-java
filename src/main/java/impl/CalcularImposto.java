package impl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import modal.Orcamento;
import modal.TipoDeImposto;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
public class CalcularImposto {

    public BigDecimal calculadora(Orcamento orcamento, TipoDeImposto tipoDeImposto) {
        switch (tipoDeImposto) {
            case ICMS:
                    return orcamento.getValor().multiply(new BigDecimal("0.1"));
            case ISS:
                return orcamento.getValor().multiply(new BigDecimal("0.6"));
            default:
                return BigDecimal.ZERO;
        }
    }
}
