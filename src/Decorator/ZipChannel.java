package Decorator;

public class ZipChannel extends ChannelDecorator {

    public ZipChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("Compactando mensagem...");
        super.send(message);
    }

    @Override
    public String receive() {
        System.out.println("Descompactando mensagem...");
        return super.receive();
    }
}

