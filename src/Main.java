import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.lang.management.MemoryNotificationInfo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("cursoJava");
        curso.setDescricao("Curso básico para aprender Java");
        curso.setCargaHoraria(10);

        Curso curso2 = new Curso();

        curso2.setTitulo("cursoC");
        curso2.setDescricao("Curso básico para aprender C");
        curso2.setCargaHoraria(12);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria da Linguagem Java");
        mentoria.setData(LocalDate.now());


//        IO.println(curso);
//        IO.println(curso2);
//        IO.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        IO.println("Conteúdos Inscritos: " + devRafael.getConteudosInscritos() );
        devRafael.progredir();
        devRafael.progredir();
        IO.println("Conteúdos Inscritos: " + devRafael.getConteudosInscritos() );
        IO.println("Conteúdos Concluidos: " + devRafael.getConteudosConcluidos() );
        IO.println("XP: " + devRafael.calcularTotalXp());

        IO.println("------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        IO.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos() );
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        IO.println("Conteúdos Inscritos: " + devJoao.getConteudosInscritos() );
        IO.println("Conteúdos Concluidos: " + devJoao.getConteudosConcluidos() );
        IO.println("XP: " + devJoao.calcularTotalXp());




    }

}
