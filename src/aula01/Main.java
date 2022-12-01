package aula01;

import aula01.VwGol;

public class Main {
    public static void main(String[] args) {
        //Consigo chamar o montar na classe, pois o método é desse contexto,
        // mas não consigo chamar o ligar, pois é do objeto

        VwGol golDoDiego = new VwGol(2002,"Preto",5);
        System.out.println("A cor do gol do Diego é: " + golDoDiego.cor);
        mudarCor(golDoDiego);
        System.out.println("A cor do gol do Diego é: " + golDoDiego.cor);

        VwGol golDoVitor = new VwGol(2021,"Branco",3);
        mudarCor(golDoVitor);
        System.out.println(golDoVitor.anoFabricao);

        // Consigo chamar o ligar, pois o método é desse contexto.
        // Não consigo chamar o montar, pois é do contexto d class
        golDoDiego.ligar();
        System.out.println("Gol do Diego ligado");
    }

    public static void mudarCor(VwGol gol){
        gol.cor = "Azul";
    }
}