package modal.pedido;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modal.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeraPedido {

    private String nomeCliente;
    private BigDecimal valorOrcamento;
    private int qtdDeItens;

    public void executa() {
        var orcamento = Orcamento.builder()
                .valor(this.valorOrcamento)
                .quantidadeItens(this.qtdDeItens)
                .build();

        var pedido = Pedido.builder()
                .nomeCliente(this.nomeCliente)
                .data(LocalDateTime.now())
                .orcamento(orcamento)
                .build();

        System.out.println("Salvar o pedido no banco de dados do cliente: " + pedido.getNomeCliente());
        System.out.println("Enviar email com as informações do pedido");
    }
}
