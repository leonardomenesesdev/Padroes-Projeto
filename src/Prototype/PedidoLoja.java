package Prototype;

public class PedidoLoja extends Pedido {

    private String vendedor;

    public PedidoLoja(String codigo, Double valor, String vendedor) {
        this.codigo = codigo;
        this.valor = valor;
        this.vendedor = vendedor;
    }

    public PedidoLoja(PedidoLoja p) {
        super(p);
        if (p != null) {
            this.vendedor = p.vendedor;
        }
    }

    @Override
    public Pedido clone() {
        return new PedidoLoja(this);
    }

    @Override
    public void exibirInfo() {
        System.out.println("PedidoLoja [código=" + codigo + ", valor=" + valor + ", vendedor=" + vendedor + "]");
    }
}