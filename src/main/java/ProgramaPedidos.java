import modal.Orcamento;
import modal.pedido.GeraPedido;
import modal.pedido.GeraPedidoHandler;
import modal.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProgramaPedidos {

    public static void main(String[] args) {

        String cliente = "Dan Araújo";
        BigDecimal valorDoOrcamento = new BigDecimal("200.0");
        int qtdDeItens = 4;

        GeraPedido geraPedido = GeraPedido.builder()
                .nomeCliente(cliente)
                .valorOrcamento(valorDoOrcamento)
                .qtdDeItens(qtdDeItens)
                .build();

        GeraPedidoHandler.executa(geraPedido);
    }
}
