package Visitor;

public class Quadrado implements Forma {
    private String nomeForma;
    private int lados;

    public Quadrado(int lados){
        this.nomeForma = "Quadrado";
        this.lados = lados;
    }


    public String aceitar(Visitor visitor) {
        return visitor.exibirQuadrado(this);
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public int getLados() {
        return lados;
    }
}
