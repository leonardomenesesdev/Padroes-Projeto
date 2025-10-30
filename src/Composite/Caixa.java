package Composite;

import java.util.ArrayList;
import java.util.List;

public class Caixa implements Item {
    private List<Item> itens = new ArrayList<>();
    private double custoEmbalagem;

    public Caixa(double custoEmbalagem) {
        this.custoEmbalagem = custoEmbalagem;
    }

    public void adicionar(Item item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        double total = custoEmbalagem;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
