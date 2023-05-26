package Visitor;

public class Triangulo implements Forma {
    private String nomeForma;
    private int lados;

    public Triangulo(String nomeForma,int lados){
        this.nomeForma = nomeForma;
        this.lados = lados;
    }


    public String aceitar(Visitor visitor) {
        return visitor.exibirTriangulo(this);
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public int getLados() {
        return lados;
    }
}
