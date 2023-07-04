package visitor;

public interface IVisitor {

    public void getPrice(Call call);

    public void getPrice(Message message);
}
