package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Carro("fusca"));
        veiculos.add(new Carro("corolla"));
        veiculos.add(new Onibus("Mercedes"));
        Visitor v = new PrintVisitor();


        for(Veiculo veiculo : veiculos) {
            veiculo.accept(v);
        }
    }
}
