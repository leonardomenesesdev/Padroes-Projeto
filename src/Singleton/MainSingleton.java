package Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Logger lg = Logger.getInstance();
        lg.log("Log message");

        DBConn db = DBConn.getInstance("db1");
        DBConn db2 = DBConn.getInstance("db2");
        System.out.println(db.value);
        System.out.println(db2.value);

    }
}
