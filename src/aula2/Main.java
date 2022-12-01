package aula2;

public class Main {
    public static void main(String[] args) {
        Aluno bethania = Aluno.matricular("Bethânia", "Dev_makers_2");
        bethania.assistirAula("POO");

        Aluno fabio = Aluno.matricular("Fabio","Dev_makers_2");
        fabio.assistirAula("Banco de dados");

        Professor William = Professor.contratar("William", Double.valueOf("1.0"));
        William.ministrarAula("Dev_makers_2", "POO");
    }

}

