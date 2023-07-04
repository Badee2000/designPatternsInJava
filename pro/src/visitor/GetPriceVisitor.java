package visitor;

public class GetPriceVisitor implements IVisitor {

    @Override
    public void getPrice(Call call) {
        System.out.println(call.call_duration * 35);
    }

    @Override
    public void getPrice(Message message) {
        System.out.println(message.cnt * 10);
    }

}
