package state;

public class NoCardState implements ATMState {

    private ATMMachine atm;

    public NoCardState(ATMMachine atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card Inserted");
        atm.setCurrentState(new HasCardState(atm));
    }

    @Override
    public void ejectCard() {
        System.out.println("FAILED ...!");
    }

    @Override
    public void insertPW(String PW) {
        System.out.println("FAILED ...!");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("FAILED ...!");
    }

}
