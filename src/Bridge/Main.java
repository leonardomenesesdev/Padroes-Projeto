package Bridge;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica circuloAzul = new Circulo(new Azul());
        FormaGeometrica cuboVermelho = new Cubo(new Vermelho());

        circuloAzul.desenhar();
        cuboVermelho.desenhar();
    }
}
