package modal.pedido;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeraPedido {

    private String nomeCliente;
    private BigDecimal valorOrcamento;
    private int qtdDeItens;
}
