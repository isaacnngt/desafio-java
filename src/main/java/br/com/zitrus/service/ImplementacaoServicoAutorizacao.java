package br.com.zitrus.service;

import br.com.zitrus.model.RegraAutorizacao;
import br.com.zitrus.repository.RepositorioSolicitacaoAutorizacao;
import br.com.zitrus.repository.RepositorioRegraAutorizacao;
import br.com.zitrus.model.SolicitacaoAutorizacao;

import java.time.LocalDateTime;
import java.util.List;

public class ImplementacaoServicoAutorizacao implements ServicoAutorizacao {
    private final RepositorioRegraAutorizacao repositorioRegra;
    private final RepositorioSolicitacaoAutorizacao repositorioSolicitacao;

    public ImplementacaoServicoAutorizacao(RepositorioRegraAutorizacao repositorioRegra, RepositorioSolicitacaoAutorizacao repositorioSolicitacao) {
        this.repositorioRegra = repositorioRegra;
        this.repositorioSolicitacao = repositorioSolicitacao;
    }

    @Override
    public void salvarRegra(RegraAutorizacao regra) {
        repositorioRegra.salvar(regra);
    }

    @Override
    public List<RegraAutorizacao> buscarTodasRegras() {
        return repositorioRegra.buscarTodos();
    }

    @Override
    public boolean estaAutorizado(String codigoProcedimento, int idade, char sexo) {
        RegraAutorizacao regra = repositorioRegra.buscarPorCodigoProcedimentoIdadeSexo(codigoProcedimento, idade, sexo);
        return regra != null && regra.isPermitido();
    }

    @Override
    public void salvarSolicitacao(SolicitacaoAutorizacao solicitacao) {
        solicitacao.setAutorizado(estaAutorizado(solicitacao.getCodigoProcedimento(), solicitacao.getIdade(), solicitacao.getSexo()));
        solicitacao.setDataSolicitacao(LocalDateTime.now());
        repositorioSolicitacao.salvar(solicitacao);
    }

    @Override
    public List<SolicitacaoAutorizacao> buscarTodasSolicitacoes() {
        return repositorioSolicitacao.buscarTodos();
    }
}