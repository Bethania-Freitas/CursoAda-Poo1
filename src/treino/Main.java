package treino;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.getDefault();
        Pessoa Beth = new Pessoa();
        Beth.idade = 38;
        Beth.sexo = "Female";
        Beth.altura = (float) 1.63;
        Beth.peso = 60;
        Beth.mostrar();

        Beth.editar();
    }





}
