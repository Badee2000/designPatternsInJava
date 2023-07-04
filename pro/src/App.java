import singleton.Printer;

public class App {
    public static void main(String[] args) {
        Printer p = Printer.getInstance();
        Printer p2 = Printer.getInstance();
        Printer p3 = Printer.getInstance();
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
