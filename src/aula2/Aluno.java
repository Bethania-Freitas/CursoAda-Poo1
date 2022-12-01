package aula2;

import java.util.ArrayList;
import java.util.UUID;

public class Aluno {

    String nome;

    String numeroMatricula;

    String curso;

    ArrayList<String> atividades = new ArrayList<>();


    // o aluno é static porque vai referenciar as classe.
    public static Aluno matricular(String nome, String curso) {
        Aluno aluno = new Aluno();
        aluno.numeroMatricula = UUID.randomUUID().toString();
        aluno.nome = nome;
        aluno.curso = curso;
        return aluno;
    }

    // as ações de cada aluno não é static porque são de cada objeto.
    public void assistirAula(String disciplina) {
        System.out.println("O aluno " + nome + " assistiu a aula de " +
                disciplina + " no curso de " + curso);
    }

    public void realizarAtividade(String displina, String atividade) {
        System.out.println("O aluno " + nome + " realizou a atividade " +
                atividade + " na disciplina " + displina + " no curso " + curso);
    }

}
