package com.aplicacao.dominio;

import java.time.LocalDate;
import java.util.Objects;
import java.util.TreeSet;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    private TreeSet<Dev> devs;
    private TreeSet<Mentoria> mentorias;
    private TreeSet<Atividade> atividades;

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

    public TreeSet<Dev> getDevs() {
        return devs;
    }

    public void setDevs(TreeSet<Dev> devs) {
        this.devs = (Objects.isNull(devs) ? new TreeSet<>() : devs);
    }

    public TreeSet<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(TreeSet<Mentoria> mentorias) {
        this.mentorias = (Objects.isNull(mentorias) ? new TreeSet<>() : mentorias);
    }

    public TreeSet<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(TreeSet<Atividade> atividades) {
        this.atividades = (Objects.isNull(atividades) ? new TreeSet<>() : atividades);
    }
    

    public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal,
                    TreeSet<Dev> devs, TreeSet<Mentoria> mentorias, TreeSet<Atividade> atividades){
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;

        this.devs = (Objects.isNull(devs) ? new TreeSet<>() : devs);
        this.mentorias = (Objects.isNull(mentorias) ? new TreeSet<>() : mentorias);
        this.atividades = (Objects.isNull(atividades) ? new TreeSet<>() : atividades);
        //se o objeto foi inicializado como nulo, para usar o método add a lista/set precisa existir.
        //se o construtor passar como nula, a lista aponta pra null e "deixa de existir"

    }

    //adders
    // public void addDev(Dev dev){
    //     this.devs.add(dev);
    // }
    //removendo este pois equivale ao método inscreverEmBootcamp da classe Dev

    public void addAtividade(Atividade atividade){
        this.atividades.add(atividade);
    }

    public void addMentoria(Mentoria mentoria){
        this.mentorias.add(mentoria);
    }

    @Override
    public String toString() {
        return String.format("Bootcamp{\n%s,\n%s,\n%s,\n%s}", 
            getNome(),getDescricao(),
            getDataInicial().toString(),
            getDataFinal().toString());
    }

}
