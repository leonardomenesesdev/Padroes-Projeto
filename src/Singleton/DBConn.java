package Singleton;

public class DBConn {


    private static DBConn Instance;
    String value;

    private DBConn(String value) {
        this.value = value;
    }

    public static DBConn getInstance(String value) {
        if (Instance == null) {
            Instance = new DBConn(value);
        }
        return Instance;
    }
    public void connect(String message) {
        System.out.println(message);
    }
}
