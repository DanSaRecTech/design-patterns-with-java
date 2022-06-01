import modal.Orcamento;
import modal.Pedido;
import services.impl.CalculadoraDeDescontos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProgramaPedidos {

    public static void main(String[] args) {

        var orcamento = Orcamento.builder()
                .valor(new BigDecimal("600.0"))
                .quantidadeItens(4)
                .build();

        var pedido = Pedido.builder()
                .nomeCliente("Dan Araújo")
                .data(LocalDateTime.now())
                .orcamento(orcamento)
                .build();

        System.out.println("Salvar o pedido no banco de dados");
        System.out.println("Enviar email com as informações do pedido");
    }
}
