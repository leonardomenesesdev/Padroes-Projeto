package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArvores {
    private static Map<String, TipoArvore> tipos = new HashMap<>();

    public static TipoArvore getTipo(String nome, String cor, String textura) {
        String chave = nome + "-" + cor + "-" + textura;
        if (!tipos.containsKey(chave)) {
            tipos.put(chave, new TipoArvore(nome, cor, textura));
        }
        return tipos.get(chave);
    }
}
