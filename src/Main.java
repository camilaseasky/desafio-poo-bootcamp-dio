import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(12);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java dio");
        bootcamp.setDescricao("descricao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila Barbosa");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos inscritos " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + devCamila.getConteudosConcluidos());
        Dev devJoao = new Dev();
        devJoao.setNome("João da Silva");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + devJoao.getConteudosConcluidos());

    }
}