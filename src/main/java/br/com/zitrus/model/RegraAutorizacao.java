package br.com.zitrus.model;

import javax.persistence.*;

@Entity
@Table(name = "REGRAS_AUTORIZACAO")
public class RegraAutorizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regras_autorizacao_seq_gen")
    @SequenceGenerator(name = "regras_autorizacao_seq_gen", sequenceName = "REGRAS_AUTORIZACAO_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO_PROCEDIMENTO", nullable = false)
    private String codigoProcedimento;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    private char sexo;

    @Column(nullable = false)
    private boolean permitido;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoProcedimento() {
        return codigoProcedimento;
    }

    public void setCodigoProcedimento(String codigoProcedimento) {
        this.codigoProcedimento = codigoProcedimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isPermitido() {
        return permitido;
    }

    public void setPermitido(boolean permitido) {
        this.permitido = permitido;
    }
}