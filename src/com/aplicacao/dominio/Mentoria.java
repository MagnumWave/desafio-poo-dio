package com.aplicacao.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria implements Comparable<Mentoria> {

    private String titulo;
    private String descricao;
    private LocalDate dataMentoria;
    private Double pesoMentoria;

    private final Double XP_PADRAO = 100d;

    //OBS: pesoMentoria e XP_PADRAO poderiam ficar em uma classe filha específica
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

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    //removendo setDataMentoria

    public Double getPesoMentoria() {
        return pesoMentoria;
    }

    public void setPesoMentoria(Double pesoMentoria) {
        this.pesoMentoria = Objects.isNull(pesoMentoria) ? 0d : pesoMentoria;
    }

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria, Double pesoMentoria){
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataMentoria = dataMentoria;
        this.pesoMentoria = Objects.isNull(pesoMentoria) ? 0d : pesoMentoria;
    }

    public Double calcularXP(){
        return XP_PADRAO * pesoMentoria;
    }

    @Override
    public String toString() {
        return String.format("Mentoria{%s,%s,%s}\n", getTitulo(), getDescricao(), getDataMentoria().toString());
    }

    @Override
    public int compareTo(Mentoria mentoria) {
        return this.titulo.compareTo(mentoria.getTitulo());
    }

}
