package modal.pedido;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modal.Orcamento;
import modal.pedido.acao.EnviarEmail;
import modal.pedido.acao.SalvarPedidoBD;

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

        var enviarEmail = new EnviarEmail();
        var salvarBd = new SalvarPedidoBD();

        enviarEmail.executar(pedido);
        salvarBd.executar(pedido);
    }
}
