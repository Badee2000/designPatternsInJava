package visitor;

public class Message implements IContact {

    int cnt;

    public Message(int cnt) {
        this.cnt = cnt;
    }

    @Override
    public void getPrice(IVisitor visitor) {
        visitor.getPrice(this);
    }

}
