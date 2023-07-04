package mediator;

public interface IChatRoom {

    public void sendMessage(User user, String msg);

    public void register(User user);

    public void unregister(User user);
}
