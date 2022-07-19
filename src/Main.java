import Desafio.Dominio.Bootcamp;
import Desafio.Dominio.Curso;
import Desafio.Dominio.Dev;
import Desafio.Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descricao sobre curso java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("Descricao sobre curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp: Java Developer");
        bootcamp.setDescricao("Descriçao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJenny = new Dev();
        devJenny.setNome("Jennifer");
        devJenny.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jenny: " + devJenny.getConteudosInscritos());
        devJenny.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jenny: " + devJenny.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jenny: " + devJenny.getConteudosConcluidos());
        System.out.println("XP: "+ devJenny.calcularxp());

        System.out.println("---------");

        Dev devLara = new Dev();
        devLara.setNome("Lara");
        devLara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lara: " + devLara.getConteudosInscritos());
        devLara.progredir();
        devLara.progredir();
        devLara.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Lara: " + devLara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lara: " + devLara.getConteudosConcluidos());
        System.out.println("XP: "+ devLara.calcularxp());
    }

}
