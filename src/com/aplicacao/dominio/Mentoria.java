package com.aplicacao.dominio;

import java.time.LocalDate;

public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate dataMentoria;

    private final double XP_PADRAO = 100.0;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    //removendo setData

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria){
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataMentoria = dataMentoria;
    }

    public double calcularXP(){
        return XP_PADRAO;
    }

}
