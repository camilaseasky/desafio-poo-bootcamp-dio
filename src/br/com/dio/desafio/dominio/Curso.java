package br.com.dio.desafio.dominio;

import lombok.Data;

@Data
public class Curso extends Conteudo {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                '}';
    }
}
