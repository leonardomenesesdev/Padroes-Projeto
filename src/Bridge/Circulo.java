package Bridge;

public class Circulo extends FormaGeometrica {
    public Circulo(Cor cor) {
        super(cor);
    }

    public void desenhar() {
        System.out.println("Desenhando um círculo " + cor.aplicarCor());
    }
}
