package Decorator;

public class UDPChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("Enviando via UDP: " + message);
    }

    @Override
    public String receive() {
        return "Mensagem recebida via UDP";
    }
}

