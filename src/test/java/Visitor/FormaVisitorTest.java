package Visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormaVisitorTest {
    @Test
    void deveExibirQuadrado() {
        Quadrado quadrado = new Quadrado(4);

        FormaVisitor visitor = new FormaVisitor();
        assertEquals("Quadrado{Nome=Quadrado, Lados=4'}", visitor.exibir(quadrado));
    }
    @Test
    void deveExibirTriangulo() {
        Triangulo triangulo = new Triangulo("Triangulo Retangulo",3);

        FormaVisitor visitor = new FormaVisitor();
        assertEquals("Triangulo{Nome=Triangulo Retangulo, Lados=3'}", visitor.exibir(triangulo));
    }
}
