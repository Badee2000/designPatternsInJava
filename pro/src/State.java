import state.ATMMachine;

public class State {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine(0);
        atm.insertCard();
        atm.ejectCard();
        atm.ejectCard();

    }
}
