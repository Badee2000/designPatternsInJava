package mediator;

public class DesktopUser extends User {

    public DesktopUser(String name, IChatRoom room) {
        super(name, room);
    }

    @Override
    public void receive(User sender, String msg) {
        System.out.println("Receive Message from " + sender.getName() + " : " + msg + " via desktop");

    }

}
