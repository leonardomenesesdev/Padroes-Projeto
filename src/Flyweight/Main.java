package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Arvore> floresta = new ArrayList<>();

        floresta.add(new Arvore(10, 20, FabricaDeArvores.getTipo("Carvalho", "Verde", "Textura1")));
        floresta.add(new Arvore(30, 40, FabricaDeArvores.getTipo("Carvalho", "Verde", "Textura1")));
        floresta.add(new Arvore(50, 60, FabricaDeArvores.getTipo("Pinheiro", "Verde-escuro", "Textura2")));
        floresta.add(new Arvore(70, 80, FabricaDeArvores.getTipo("Carvalho", "Verde", "Textura1")));

        for (Arvore a : floresta) {
            a.desenhar();
        }

        System.out.println("\nTipos de árvore criados: " + FabricaDeArvores.getTipo("Carvalho", "Verde", "Textura1"));
    }
}
