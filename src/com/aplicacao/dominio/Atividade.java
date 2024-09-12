package com.aplicacao.dominio;

public class Atividade {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    private final double XP_POR_HORA = 50.0;

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Atividade(String titulo, String descricao, int cargaHoraria){
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXP(){
        return cargaHoraria * XP_POR_HORA;
    };

}
