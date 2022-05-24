package impl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import modal.Orcamento;
import service.Imposto;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
public class ICMS implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
