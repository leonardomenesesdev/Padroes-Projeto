package Bridge;

public class Cubo extends FormaGeometrica {
    public Cubo(Cor cor) {
        super(cor);
    }

    public void desenhar() {
        System.out.println("Desenhando um cubo " + cor.aplicarCor());
    }
}
