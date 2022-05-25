package services.impl;

import modal.DescontoAcimaDeCincoItens;
import modal.DescontoAcimaValorEstabelecido;
import modal.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        var desconto = new DescontoAcimaDeCincoItens(
                new DescontoAcimaValorEstabelecido(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
