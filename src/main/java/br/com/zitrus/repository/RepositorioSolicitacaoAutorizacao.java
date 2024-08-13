package br.com.zitrus.repository;

import br.com.zitrus.model.SolicitacaoAutorizacao;
import java.util.List;

public interface RepositorioSolicitacaoAutorizacao {
    void salvar(SolicitacaoAutorizacao solicitacao);
    SolicitacaoAutorizacao buscarPorId(Long id);
    List<SolicitacaoAutorizacao> buscarTodos();
    void atualizar(SolicitacaoAutorizacao solicitacao);
    void excluir(SolicitacaoAutorizacao solicitacao);
}