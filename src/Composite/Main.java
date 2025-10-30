package Composite;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Livro", 30.0);
        Produto p2 = new Produto("Caneta", 5.0);
        Produto p3 = new Produto("Mouse", 50.0);

        Caixa caixaPequena = new Caixa(2.0);
        caixaPequena.adicionar(p1);
        caixaPequena.adicionar(p2);

        Caixa caixaGrande = new Caixa(5.0);
        caixaGrande.adicionar(caixaPequena);
        caixaGrande.adicionar(p3);

        System.out.println("Preço total do pedido: R$ " + caixaGrande.getPreco());
    }
}

