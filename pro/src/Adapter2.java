import adapter2.ConcreteVisitor;
import adapter2.Mobile;
import adapter2.IVisitor;

public class Adapter2 {
    public static void main(String[] args) {
        Mobile c = new Mobile("D800", "Canon", 1000);
        IVisitor iv = new ConcreteVisitor(c);
        System.out.println(iv.getPrice(c));
    }
}
