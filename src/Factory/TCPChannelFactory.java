package Factory;

public class TCPChannelFactory extends ChannelFactory {
    @Override
    public Channel create(){
        return new TCPChannel();
    }
}
