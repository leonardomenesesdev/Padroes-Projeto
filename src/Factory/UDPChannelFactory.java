package Factory;

public class UDPChannelFactory extends ChannelFactory{
    @Override
    public Channel create(){
        return new UDPChannel();
    }
}
