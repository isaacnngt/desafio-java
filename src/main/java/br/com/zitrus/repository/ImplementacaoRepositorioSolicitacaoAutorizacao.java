package br.com.zitrus.repository;

import br.com.zitrus.model.SolicitacaoAutorizacao;
import br.com.zitrus.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ImplementacaoRepositorioSolicitacaoAutorizacao implements RepositorioSolicitacaoAutorizacao {
    @Override
    public void salvar(SolicitacaoAutorizacao solicitacao) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(solicitacao);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public SolicitacaoAutorizacao buscarPorId(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(SolicitacaoAutorizacao.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<SolicitacaoAutorizacao> buscarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<SolicitacaoAutorizacao> query = em.createQuery("SELECT sa FROM SolicitacaoAutorizacao sa", SolicitacaoAutorizacao.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public void atualizar(SolicitacaoAutorizacao solicitacao) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(solicitacao);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void excluir(SolicitacaoAutorizacao solicitacao) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.contains(solicitacao) ? solicitacao : em.merge(solicitacao));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}