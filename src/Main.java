import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JavaDeveloper");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCleonice = new Dev();
        devCleonice.setNome("Cleonice");
        devCleonice.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cleonice" + devCleonice.getConteudosInscritos());

        devCleonice.progedir();
        devCleonice.progedir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Cleonice" + devCleonice.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Cleonice" + devCleonice.getConteudosConcluidos());
        System.out.println("XP:" + devCleonice.calcularXp());

        System.out.println("-------------");

        Dev devCarla = new Dev();
        devCarla.setNome("Carla");
        devCarla.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carla" + devCarla.getConteudosInscritos());
        devCarla.progedir();
        devCarla.progedir();
        devCarla.progedir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carla" + devCarla.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Carla" + devCarla.getConteudosConcluidos());
        System.out.println("XP:" + devCarla.calcularXp());


    }
}
