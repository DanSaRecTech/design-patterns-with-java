package modal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@Data
public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
}
