package mediator;

import java.util.ArrayList;

public class ChatRoom implements IChatRoom {
    private ArrayList<User> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }

    public void sendMessage(User user, String msg) {
        for (User u : users) {
            if (u != user) {
                u.receive(user, msg);
            }
        }
    }

    public void register(User user) {
        users.add(user);
    }

    public void unregister(User user) {
        users.remove(user);
    }

}
