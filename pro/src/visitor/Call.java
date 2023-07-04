package visitor;

public class Call implements IContact {

    int call_duration;

    public Call(int call_duration) {
        this.call_duration = call_duration;
    }

    @Override
    public void getPrice(IVisitor visitor) {
        visitor.getPrice(this);
    }

}
