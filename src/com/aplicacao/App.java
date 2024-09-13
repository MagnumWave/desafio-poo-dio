package com.aplicacao;

import java.time.LocalDate;
import java.util.TreeSet;

import com.aplicacao.dominio.Atividade;
import com.aplicacao.dominio.Bootcamp;
import com.aplicacao.dominio.Dev;
import com.aplicacao.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Atividade atividade1 = new Atividade("Aula 01 Java", "Aula ZeroUm de Java", 4, 0.5);
        Atividade atividade2 = new Atividade("Aula 02 Java", "Aula ZeroDois de Java", 4, 1.0);
        Atividade atividade3 = new Atividade("Aula 03 Java", "Aula ZeroTres de Java", 8, 2.5);
        Atividade atividade4 = new Atividade("Aula 04 Python", "Aula ZeroQuatro de Python", 8, 1.72);
        
        System.out.println("Exp da atividade 1: "+atividade1.calcularXP());
        System.out.println("Exp da atividade 2: "+atividade2.calcularXP());
        System.out.println("Exp da atividade 3: "+atividade3.calcularXP());

        TreeSet<Atividade> atividades = new TreeSet<>();
        atividades.add(atividade1);
        atividades.add(atividade2);
        atividades.add(atividade3);

        TreeSet<Mentoria> mentorias = new TreeSet<>();
        Mentoria mentoria1 = new Mentoria("Mentor 01", "Primeiro mentor!", LocalDate.now(),1.0);
        Mentoria mentoria2 = new Mentoria("Mentor 02", "Segundo mentor!", LocalDate.now().plusMonths(2),0.5);
        Mentoria mentoria3 = new Mentoria("Mentor 03", "Terceiro mentor!", LocalDate.now().minusYears(1), 1.5);
        Mentoria mentoria4 = new Mentoria("Mentor 04", "Quarto mentor!", LocalDate.now().plusWeeks(8),2.24);
        
        mentorias.add(mentoria1);
        mentorias.add(mentoria2);
        mentorias.add(mentoria3);

        
            
        Dev aurelio = new Dev("Aurélio Cunha", mentorias, atividades);
        Dev corredorX = new Dev("Corredor X", null, null);
        Dev boyle = new Dev("Boyle", null, null);

        System.out.println("Exp total de " + aurelio.getNome() + ": " + aurelio.calcularTotalXP());

        System.out.println(aurelio.toString());
        System.out.println(atividade1.toString());

        TreeSet<Dev> listaDeDevs = new TreeSet<>();
        listaDeDevs.add(aurelio);

        Bootcamp bootcamp1 = new Bootcamp("1º Bootcamp", "Primeiro bootcamp!",
                        LocalDate.now(), LocalDate.now().plusDays(3),
                        listaDeDevs, null, atividades);
        
        System.out.println("------------------");
        System.out.println("Printando Bootcamp:");
        System.out.println("------------------");

        System.out.println(bootcamp1.toString());

        System.out.println(bootcamp1.getDevs().toString());
        //bootcamp1.addDev(corredorX); //metodo removido de Bootcamp
        corredorX.inscreverEmBootcamp(bootcamp1);
        System.out.println(bootcamp1.getDevs().toString());
        // bootcamp1.addDev(boyle); 
        boyle.inscreverEmBootcamp(bootcamp1);
        System.out.println(bootcamp1.getDevs().toString());


        System.out.println(bootcamp1.getAtividades());
        bootcamp1.addAtividade(atividade4);
        System.out.println(bootcamp1.getAtividades());

        System.out.println("------------------");
        System.out.println("printando Devs e mentorias:");
        System.out.println("------------------");
        
        System.out.println(aurelio.getMentorias());
        mentorias.add(mentoria4);
        System.out.println(aurelio.getMentorias());

        System.out.println(aurelio.calcularTotalXP());
        // corredorX.setAtividades(atividades); aqui usa uma lista
        corredorX.progredir(atividade4); //aqui usa um item da lista
        System.out.println(aurelio.calcularTotalXP());
        System.out.println(corredorX.calcularTotalXP());
        System.out.println(boyle.calcularTotalXP());

        aurelio.exibirCursos();
        boyle.exibirCursos();
        // boyle.setAtividades(atividades);
        // boyle.exibirCursos();

        boyle.progredir(atividade1);
        boyle.exibirCursos();

        
        System.out.println(mentoria1.calcularXP());
        System.out.println(mentoria2.calcularXP());

        System.out.println("------------------");
        System.out.println("printando atividades:");
        System.out.println("------------------");

        System.out.println(atividade1.calcularXP());
        System.out.println(atividade2.calcularXP());
        System.out.println(atividade3.calcularXP());
        System.out.println(atividade4.calcularXP());
        
    }
}
