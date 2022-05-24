import impl.CalcularImposto;
import modal.Orcamento;
import static modal.TipoDeImposto.ICMS;

import java.math.BigDecimal;

public class Programa {

    public static void main(String[] args) {

        var orcamento = Orcamento.builder()
                .valor(new BigDecimal("100.0"))
                .build();

        var calculadora = CalcularImposto.builder().build();

        System.out.println(calculadora.calculadora(orcamento, ICMS));
    }
}
