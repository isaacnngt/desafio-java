package br.com.zitrus.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SOLICITACOES_AUTORIZACAO")
public class SolicitacaoAutorizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "solicitacoes_autorizacao_seq_gen")
    @SequenceGenerator(name = "solicitacoes_autorizacao_seq_gen", sequenceName = "SOLICITACOES_AUTORIZACAO_SEQ", allocationSize = 1)
    private Long id;


    @Column(name = "CODIGO_PROCEDIMENTO", nullable = false)
    private String codigoProcedimento;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    private char sexo;

    @Column(nullable = false)
    private boolean autorizado;

    @Column(name = "DATA_SOLICITACAO", nullable = false)
    private LocalDateTime dataSolicitacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCodigoProcedimento() {
        return codigoProcedimento;
    }

    public void setCodigoProcedimento(String codigoProcedimento) {
        this.codigoProcedimento = codigoProcedimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
}