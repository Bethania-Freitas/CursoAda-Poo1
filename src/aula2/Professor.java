package aula2;

import java.util.ArrayList;
import java.util.UUID;

public class Professor {
    String matricula;
    String nome;
    ArrayList<String> disciplina = new ArrayList<>();
    ArrayList<String> turmas = new ArrayList<>();
    double valorHoraAula;

    // o professor é static porque vai referencial as classe.
    public static Professor contratar(String nome, Double valorHoraAula) {
        Professor prof = new Professor();
        prof.nome = nome;
        prof.valorHoraAula = valorHoraAula;
        prof.matricula = UUID.randomUUID().toString();
        prof.disciplina.add("POO-1");
        prof.disciplina.add("POO-2");
        prof.turmas.add("Dev_makers_2");
        return prof;
    }

    //as ações não são static porque se referem a cada objeto.
    public void ministrarAula(String turma, String disciplina) {
        System.out.println("O professor " + nome + " ministrou a aula de " +
                disciplina + " na turma " + turma);
    }

    public void corrirgirAtividade(String turma, String disciplina, String atividade) {
        System.out.println("O professor " + nome + " corrigiu o atividade " +
                atividade + " da turma " + turma + " e disciplina " + disciplina);
    }
}
