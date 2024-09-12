package com.aplicacao.dominio;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Dev {

    private String nome;
    private List<Mentoria> mentorias;
    private Set<Atividade> atividades;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    public Dev(String nome, List<Mentoria> mentorias, Set<Atividade> atividades){
        this.nome = nome;
        this.mentorias = mentorias;
        this.atividades = atividades;
    }

    public void inscreverEmBootcamp(Bootcamp bootcamp){
        bootcamp.addDev(this);
    }

    public void progredir(Atividade atividade){
        this.atividades.add(atividade);
    }

    public double calcularTotalXP(){

        double somaMentoria = this.mentorias.stream().mapToDouble( x -> x.calcularXP()).sum();
        double somaAtividade = this.atividades.stream().mapToDouble( x -> x.calcularXP()).sum();

        return somaMentoria + somaAtividade;
    }

    public void exibirCursos(){
        //quero uma lista de strings
        List<String> listaDeCursos = this.atividades.stream().map(x -> x.getTitulo()).collect(Collectors.toList());
        String resultado = String.join(",", listaDeCursos);

        System.out.println("Cursos em que " + getNome() + " está inscrito: " + resultado);
    }

}
