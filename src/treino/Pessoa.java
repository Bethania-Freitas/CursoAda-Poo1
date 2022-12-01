package treino;

import java.util.Scanner;

public class Pessoa {
    static Scanner sc = new Scanner(System.in);
    int idade;
    String sexo;
    float peso;
    float altura;
    public void mostrar() {
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.idade = idade;
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
    }

    public void editar() {
        System.out.println("Idade: " );
        idade = sc.nextInt();
        System.out.println("Sexo: " );
        sexo =  sc.next();
        System.out.println("Peso: " );
        peso = sc.nextFloat();
        System.out.println("Altura: " );
        altura = sc.nextFloat();
        mostrar();
    }
}


