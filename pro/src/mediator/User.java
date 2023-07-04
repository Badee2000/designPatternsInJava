package mediator;

public abstract class User {

    private String name;
    private IChatRoom room;

    public User(String name, IChatRoom room) {
        this.name = name;
        this.room = room;
    }

    public abstract void receive(User sender, String msg);

    public void send(String msg) {
        room.sendMessage(this, msg);
    }

    public String getName() {
        return name;
    }
}
