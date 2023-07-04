package state;

public class HasCardState implements ATMState {

    private ATMMachine atm;

    public HasCardState(ATMMachine atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("FAILED ...!");

    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atm.setCurrentState(new NoCardState(atm));

    }

    @Override
    public void insertPW(String PW) {
        if (PW == "123") {
            System.out.println("Correct Password");
            atm.setCurrentState(new NoCardState(atm));
        } else
            System.out.println("False Password");

    }

    @Override
    public void requestCash(int amount) {
        System.out.println("FAILED ...!");

    }

}
