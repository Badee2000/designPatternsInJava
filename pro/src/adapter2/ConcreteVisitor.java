package adapter2;

public class ConcreteVisitor implements IVisitor {

    private Mobile m;

    public ConcreteVisitor(Mobile m) {
        this.m = m;
    }

    @Override
    public int getPrice(Mobile m) {
        return m.getPrice() * 2;
    }

}
