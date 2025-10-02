package Prototype;

public class MainPrototype {
    public static void main(String[] args) {
        Pedido pedidoOnline = new PedidoOnline("P001", 500.0, "Rua A, 123");
        pedidoOnline.exibirInfo();

        Pedido pedidoOnlineClone = pedidoOnline.clone();
        pedidoOnlineClone.exibirInfo();

        Pedido pedidoLoja = new PedidoLoja("P002", 300.0, "Carlos");
        pedidoLoja.exibirInfo();

        Pedido pedidoLojaClone = pedidoLoja.clone();
        pedidoLojaClone.exibirInfo();
    }
}
