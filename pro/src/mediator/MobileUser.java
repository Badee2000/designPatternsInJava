package mediator;

public class MobileUser extends User {

    public MobileUser(String name, IChatRoom room) {
        super(name, room);
    }

    @Override
    public void receive(User sender, String msg) {
        System.out.println("Receive Message from " + sender.getName() + " : " + msg + " via mobile");
    }

}
