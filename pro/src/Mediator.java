import mediator.ChatRoom;
import mediator.User;
import mediator.DesktopUser;
import mediator.MobileUser;

public class Mediator {
    public static void main(String[] args) {
        ChatRoom myRoom = new ChatRoom();
        User badee = new MobileUser("Badee", myRoom);
        User ali = new DesktopUser("Ali", myRoom);
        User ahmad = new MobileUser("Ahmad", myRoom);
        myRoom.register(ahmad);
        myRoom.register(ali);
        myRoom.register(badee);
        badee.send("Hello");
        myRoom.sendMessage(ahmad, "Ahmad Hi");
    }
}
