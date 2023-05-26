package Visitor;

public class FormaVisitor implements Visitor {
    public String exibir(Forma forma) {
        return forma.aceitar(this);
    }

    @Override
    public String exibirQuadrado(Quadrado quadrado) {
        return "Quadrado{" +
                "Nome=" + quadrado.getNomeForma() +
                ", Lados=" + quadrado.getLados() +'\'' +
                '}';
    }
    @Override
    public String exibirTriangulo(Triangulo triangulo) {
        return "Triangulo{" +
                "Nome=" + triangulo.getNomeForma() +
                ", Lados=" + triangulo.getLados() +'\'' +
                '}';
    }
}
