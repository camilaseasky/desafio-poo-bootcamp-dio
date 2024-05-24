package br.com.dio.desafio.dominio;

import lombok.Data;

@Data
public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    private Professor professorAlocado;

    public abstract double calcularXp();

    public void alocarProfessor(Professor professor) {
        this.professorAlocado = professor;
        professor.getAlocacoesEmConteudos().add(this);
    }


}
