package Bridge;

public abstract class FormaGeometrica {
    protected Cor cor;

    public FormaGeometrica(Cor cor) {
        this.cor = cor;
    }

    abstract void desenhar();
}
