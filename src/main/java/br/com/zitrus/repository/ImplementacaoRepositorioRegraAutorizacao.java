package br.com.zitrus.repository;

import br.com.zitrus.model.RegraAutorizacao;
import br.com.zitrus.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ImplementacaoRepositorioRegraAutorizacao implements RepositorioRegraAutorizacao {
    @Override
    public void salvar(RegraAutorizacao regra) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(regra);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public RegraAutorizacao buscarPorId(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(RegraAutorizacao.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<RegraAutorizacao> buscarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<RegraAutorizacao> query = em.createQuery("SELECT ra FROM RegraAutorizacao ra", RegraAutorizacao.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public void atualizar(RegraAutorizacao regra) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(regra);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void excluir(RegraAutorizacao regra) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.contains(regra) ? regra : em.merge(regra));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public RegraAutorizacao buscarPorCodigoProcedimentoIdadeSexo(String codigoProcedimento, int idade, char sexo) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<RegraAutorizacao> query = em.createQuery(
                    "SELECT ra FROM RegraAutorizacao ra WHERE ra.codigoProcedimento = :codigoProcedimento AND ra.idade = :idade AND ra.sexo = :sexo",
                    RegraAutorizacao.class
            );
            query.setParameter("codigoProcedimento", codigoProcedimento);
            query.setParameter("idade", idade);
            query.setParameter("sexo", sexo);
            List<RegraAutorizacao> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            em.close();
        }
    }
}
