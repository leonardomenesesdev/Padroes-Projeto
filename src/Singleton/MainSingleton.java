package Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Logger lg = Logger.getInstance();
        lg.log("MainSingleton");
    }
}
