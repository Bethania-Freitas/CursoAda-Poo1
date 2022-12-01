package aula01;

public class VwGol {

    int anoFabricao;
    String cor;
    int qtdePortas;

    boolean ligado = false;

    public VwGol(int anoFabricao, String cor, int qtdePortas) {
        this.anoFabricao = anoFabricao;
        this.cor = cor;
        this.qtdePortas = qtdePortas;
    }



    public void ligar() {
        // Sem a palavra static o método pertence ao contexto do objeto
        // e não da classe
        // A palavra 'this' referencia o objeto que estou manipulando
        this.ligado = true;
    }

}