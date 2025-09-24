package Singleton;

public class Logger {
    private Logger(){}
    private static Logger instance;

    public static Logger getInstance(){
        if(instance == null){
            return new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println(message);
    }
}
