package singleton;

public class Printer {
    private static Printer instance;

    private Printer() {
        System.out.println("Constructer");
    }

    public static synchronized Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }
}
