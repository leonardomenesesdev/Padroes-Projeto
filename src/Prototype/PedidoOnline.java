package Prototype;

public class PedidoOnline extends Pedido {
    private String enderecoEntrega;
    public PedidoOnline(String codigo, Double valor, String enderecoEntrega) {
        this.codigo = codigo;
        this.valor = valor;
        this.enderecoEntrega = enderecoEntrega;
    }
    public PedidoOnline(PedidoOnline p) {
        super(p);
        if (p != null) {
            this.enderecoEntrega = p.enderecoEntrega;
        }
    }

    @Override
    public Pedido clone() {
        return new PedidoOnline(this);
    }
    @Override
    public void exibirInfo() {
        System.out.println("PedidoOnline [código=" + codigo + ", valor=" + valor + ", entrega=" + enderecoEntrega + "]");
    }
}
