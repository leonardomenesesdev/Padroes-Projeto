package Prototype;

public class Pedido implements Prototype<Pedido> {
    private String cliente;
    private String endereco;
    private String formaPagamento;

    public Pedido(String cliente, String endereco, String formaPagamento) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.formaPagamento = formaPagamento;
    }

    public Pedido(Pedido source) {
        if (source != null) {
            this.cliente = source.cliente;
            this.endereco = source.endereco;
            this.formaPagamento = source.formaPagamento;
        }
    }

    @Override
    public Pedido clone() {
        return new Pedido(this);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", endereco='" + endereco + '\'' +
                ", formaPagamento='" + formaPagamento + '\'' +
                '}';
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
