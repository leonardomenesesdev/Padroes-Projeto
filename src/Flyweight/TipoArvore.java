package Flyweight;

public class TipoArvore {
    private String nome;
    private String cor;
    private String textura;

    public TipoArvore(String nome, String cor, String textura) {
        this.nome = nome;
        this.cor = cor;
        this.textura = textura;
    }

    public void desenhar(int x, int y) {
        System.out.println("Desenhando árvore do tipo " + nome + " (" + cor + ") na posição (" + x + ", " + y + ")");
    }
}
