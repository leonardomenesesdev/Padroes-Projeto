package Builder;

public class MainBuilder {
    public static void main(String[] args) {
        Pedido pedido = new Pedido.Builder()
                .setCliente("Leonardo")
                .setEndereco("Rua A, 123")
                .setFormaPagamento("Cartão")
                .build();
        System.out.println(pedido.getCliente());
    }
}
