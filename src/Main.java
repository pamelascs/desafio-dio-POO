import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Springboot ");
        curso1.setDescricao("descrição curso Springboot");
        curso1.setCargaHoraria(6);



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Dio");
        mentoria1.setDescricao("descricao da mentoria");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Java");
        bootcamp.setDescricao("Bootcamp de Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPamela = new Dev();
        devPamela.setNome("Pamela");
        devPamela.inscreverBootecamp(bootcamp);
        System.out.println("Conteudos Inscritos:" + devPamela.getConteudosInscritos());
        devPamela.progredir();
        devPamela.progredir();
        devPamela.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos:" + devPamela.getConteudosInscritos());
        System.out.println("Conteudos concluidos:" + devPamela.getConteudosConcluidos());
        System.out.println("XP:" + devPamela.calcularTotalxp());

        System.out.println("---------------------------");
        Dev devYuri = new Dev();
        devYuri.setNome("Yuri");
        devYuri.inscreverBootecamp(bootcamp);
        System.out.println("Conteudo inscritos:" + devYuri.getConteudosInscritos());
        devYuri.progredir();
        System.out.println("--");
        System.out.println("Conteudo inscritos:" + devYuri.getConteudosInscritos());
        System.out.println("Conteudos concluidos:" + devYuri.getConteudosConcluidos());
        System.out.println("XP:" + devYuri.calcularTotalxp());

    }
}
