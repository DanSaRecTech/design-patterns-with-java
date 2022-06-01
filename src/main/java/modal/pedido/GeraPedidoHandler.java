package modal.pedido;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modal.Orcamento;

import java.time.LocalDateTime;

@Builder
@Data
public class GeraPedidoHandler {

    //estaria injetando as dependências para salvar no banco de dados e enviar email.

    public static void executa(GeraPedido geraPedido) {
        var orcamento = Orcamento.builder()
                .valor(geraPedido.getValorOrcamento())
                .quantidadeItens(geraPedido.getQtdDeItens())
                .build();

        var pedido = Pedido.builder()
                .nomeCliente(geraPedido.getNomeCliente())
                .data(LocalDateTime.now())
                .orcamento(orcamento)
                .build();

        System.out.println("Salvar o pedido no banco de dados do cliente: " + pedido.getNomeCliente());
        System.out.println("Enviar email com as informações do pedido");
    }
}
