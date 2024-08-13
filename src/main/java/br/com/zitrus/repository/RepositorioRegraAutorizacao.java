package br.com.zitrus.repository;

import br.com.zitrus.model.RegraAutorizacao;
import java.util.List;

public interface RepositorioRegraAutorizacao {
    void salvar(RegraAutorizacao regra);
    RegraAutorizacao buscarPorId(Long id);
    List<RegraAutorizacao> buscarTodos();
    void atualizar(RegraAutorizacao regra);
    void excluir(RegraAutorizacao regra);
    RegraAutorizacao buscarPorCodigoProcedimentoIdadeSexo(String codigoProcedimento, int idade, char sexo);
}
