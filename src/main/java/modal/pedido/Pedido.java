package modal.pedido;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modal.Orcamento;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private String nomeCliente;
    private LocalDateTime data;
    private Orcamento orcamento;
}
