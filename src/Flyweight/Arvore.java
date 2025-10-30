package Flyweight;

public class Arvore {
    private int x, y; // estado extrínseco
    private TipoArvore tipo; // estado intrínseco

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void desenhar() {
        tipo.desenhar(x, y);
    }
}
