package Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Logger lg = Logger.getInstance();
        lg.log("Log message");

        DBConn db = DBConn.getInstance();
        db.connect("Db connected");
    }
}
