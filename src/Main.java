import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("POO - Programação orientada a objetos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Abstraindo Em POO");
        curso2.setDescricao("Bootcamp Usando Orientação a Objetos Em Java");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Orientações em Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatt = new Dev();
        devMatt.setNome("Matt");
        devMatt.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matt:" + devMatt.getConteudosInscritos());
        devMatt.progredir();
        devMatt.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matt:" + devMatt.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Matt:" + devMatt.getConteudosConcluidos());
        System.out.println("XP:" + devMatt.calcularTotalXp());

        System.out.println("-------");

        Dev devGaby = new Dev();
        devGaby.setNome("Gaby");
        devGaby.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gaby:" + devGaby.getConteudosInscritos());
        devGaby.progredir();
        devGaby.progredir();
        devGaby.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gaby:" + devGaby.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gaby:" + devGaby.getConteudosConcluidos());
        System.out.println("XP:" + devGaby.calcularTotalXp());
    }
}
