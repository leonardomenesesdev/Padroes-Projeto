package Decorator;

public interface Channel {
    public void send(String message);
    public String receive();
}
