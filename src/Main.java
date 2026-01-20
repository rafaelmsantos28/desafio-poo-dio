import br.com.dio.desafio.dominio.Curso;
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


        IO.println(curso);
        IO.println(curso2);
        IO.println(mentoria);


    }

}
