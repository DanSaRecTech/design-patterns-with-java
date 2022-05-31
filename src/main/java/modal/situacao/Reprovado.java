package modal.situacao;

import modal.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}
