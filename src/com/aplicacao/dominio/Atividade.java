package com.aplicacao.dominio;

import java.util.Objects;

public class Atividade implements Comparable<Atividade> {

    private String titulo;
    private String descricao;
    private int cargaHoraria;
    private Double pesoAtividade;

    private final Double XP_POR_HORA = 50d;

    //OBS: pesoAtividade e XP_POR_HORA poderiam ficar em uma classe filha específica
    // e a classe mãe poderia ser abstrata.
    //
    //Nesse caso, os diferenciadores de experiência não ficariam definidos por quem instancia a classe,
    // e sim ficariam definidos no código de forma isolada e desacoplada.

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

    public Double getPesoAtividade() {
        return pesoAtividade;
    }

    // public void setPesoAtividade(Double pesoAtividade) {
    //     this.pesoAtividade = Objects.isNull(pesoAtividade) ? 0d : pesoAtividade;
    // }

    public Atividade(String titulo, String descricao, int cargaHoraria, Double pesoAtividade){
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.pesoAtividade = Objects.isNull(pesoAtividade) ? 0d : pesoAtividade;
    }

    public Double calcularXP(){
        return cargaHoraria * XP_POR_HORA * pesoAtividade;
    };

    @Override
    public String toString() {
        return String.format("Atividade{%s,%s,%s}\n", getTitulo(), getDescricao(), getCargaHoraria());
    }

    @Override
    public int compareTo(Atividade atividade) {
        return this.titulo.compareTo(atividade.getTitulo());
    }

}
