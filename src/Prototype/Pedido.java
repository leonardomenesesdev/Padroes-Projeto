package Prototype;

public abstract class Pedido {
    public String codigo;
    public Double valor;

    public Pedido() {
    }
    public Pedido(Pedido p){
        if(p != null) {
            this.codigo = p.codigo;
            this.valor = p.valor;
        }
    }
    public void exibirInfo() {
        System.out.println("Pedido [código=" + codigo + ", valor=" + valor + "]");
    }
    public abstract Pedido clone();

}
