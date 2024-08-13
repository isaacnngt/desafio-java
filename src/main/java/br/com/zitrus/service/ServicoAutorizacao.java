package br.com.zitrus.service;

import br.com.zitrus.model.SolicitacaoAutorizacao;
import br.com.zitrus.model.RegraAutorizacao;

import java.util.List;

public interface ServicoAutorizacao {
    void salvarRegra(RegraAutorizacao regra);
    List<RegraAutorizacao> buscarTodasRegras();
    boolean estaAutorizado(String codigoProcedimento, int idade, char sexo);
    void salvarSolicitacao(SolicitacaoAutorizacao solicitacao);
    List<SolicitacaoAutorizacao> buscarTodasSolicitacoes();
}
