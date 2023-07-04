import visitor.Call;
import visitor.GetPriceVisitor;
import visitor.IContact;
import visitor.IVisitor;
// import visitor.Message;

public class Visitor {
    public static void main(String[] args) {
        IContact call = new Call(10);
        IVisitor iv = new GetPriceVisitor();
        call.getPrice(iv);
    }
}
