import modal.Orcamento;
import services.impl.CalculadoraDeDescontos;

import java.math.BigDecimal;

public class Programa {

    public static void main(String[] args) {

        var orcamento1 = Orcamento.builder()
                .valor(new BigDecimal("1000.0"))
                .quantidadeItens(10)
                .build();
        var orcamento2 = Orcamento.builder()
                .valor(new BigDecimal("1000.0"))
                .quantidadeItens(3)
                .build();
        var calculadoraDeDesconto = new CalculadoraDeDescontos();

        System.out.println(calculadoraDeDesconto.calcular(orcamento1));
        System.out.println(calculadoraDeDesconto.calcular(orcamento2));
    }
}
