package Prototype;

public class MainPrototype {
    public static void main(String[] args) {
        Pedido pedidoOriginal = new Pedido("Leonardo", "Rua A, 123", "Cartão de Crédito");
        System.out.println("Pedido Original: " + pedidoOriginal);

        Pedido pedidoClone = pedidoOriginal.clone();
        pedidoClone.setFormaPagamento("Dinheiro"); // altera só no clone
        System.out.println("Pedido Clone: " + pedidoClone);

        System.out.println("Pedido Original após clone: " + pedidoOriginal);
    }
}
