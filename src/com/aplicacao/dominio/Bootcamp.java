package com.aplicacao.dominio;

import java.time.LocalDate;
import java.util.List;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    private List<Dev> devs;
    private List<Mentoria> mentorias;
    private List<Atividade> atividades;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }
    

    public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal,
                    List<Dev> devs, List<Mentoria> mentorias, List<Atividade> atividades){
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.devs = devs;
        this.mentorias = mentorias;
        this.atividades = atividades;

    }

    //adders
    public void addDev(Dev dev){
        this.devs.add(dev);
    }

    public void addAtividade(Atividade atividade){
        this.atividades.add(atividade);
    }

    public void addMentoria(Mentoria mentoria){
        this.mentorias.add(mentoria);
    }

}
