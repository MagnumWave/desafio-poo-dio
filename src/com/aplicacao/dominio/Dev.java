package com.aplicacao.dominio;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Dev implements Comparable<Dev>{

    private String nome;
    private Set<Mentoria> mentorias;
    private TreeSet<Atividade> atividades;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(Set<Mentoria> mentorias) {
        this.mentorias = (Objects.isNull(mentorias) ? new HashSet<>() : mentorias);
    }

    public TreeSet<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(TreeSet<Atividade> atividades) {
        this.atividades = (Objects.isNull(atividades) ? new TreeSet<>() : atividades);
    }

    public Dev(String nome, Set<Mentoria> mentorias, TreeSet<Atividade> atividades){
        this.nome = nome;
        this.mentorias = (Objects.isNull(mentorias) ? new HashSet<>() : mentorias);
        this.atividades = (Objects.isNull(atividades) ? new TreeSet<>() : atividades);
        //se o objeto foi inicializado como nulo, para usar o método add a lista/set precisa existir.
        //se o construtor passar como nula, a lista aponta pra null e "deixa de existir"
    }

    public void inscreverEmBootcamp(Bootcamp bootcamp){
        TreeSet<Dev> listaDeDevs = bootcamp.getDevs();
        listaDeDevs.add(this);
        bootcamp.setDevs(listaDeDevs);
    }

    public void progredir(Atividade atividade){
        this.atividades.add(atividade);
    }

    public Double calcularTotalXP(){

        Double result = 0d;

        if (!this.mentorias.isEmpty()) {
            result += this.mentorias.stream().map(x -> x.calcularXP()).reduce(0d,(a,b) -> a + b);
        }

        if (!this.atividades.isEmpty()) {
            result += this.atividades.stream().map(x -> x.calcularXP()).reduce(0d,(a,b) -> a + b);
        }

        return result;
    }

    public void exibirCursos(){
        //quero uma lista de strings
        if (!this.atividades.isEmpty()) {
            
            List<String> listaDeCursos = this.atividades.stream().map(x -> x.getTitulo()).collect(Collectors.toList());
            String resultado = String.join(",", listaDeCursos);
    
            System.out.println("Cursos em que " + getNome() + " está inscrito: " + resultado);
            return;
        }
        
        System.out.println(getNome() + " não está inscrito em nenhum curso.");
    }

    @Override
    public String toString() {
        return String.format("Dev{%s}", getNome());
    }

    @Override
    public int compareTo(Dev dev) {
        return this.nome.compareTo(dev.getNome());
    }

}
