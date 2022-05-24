package impl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import modal.Orcamento;
import service.Imposto;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
public class CalcularImposto {

    public BigDecimal calculadora(Orcamento orcamento, Imposto imposto) {

        return imposto.calcular(orcamento);
    }
}