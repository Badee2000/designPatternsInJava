package state;

public class ATMMachine {

    ATMState currentState;
    private int totalBalance;
    ATMMachine atm;

    public ATMMachine(int balance) {
        currentState = new NoCardState(atm);
        totalBalance = balance;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void insertPW(String pw) {
        currentState.insertPW(pw);
    }

    public void requestCash(int amount) {
        currentState.requestCash(amount);
    }

    public void setTotalBalance(int balance) {
        this.totalBalance = balance;
    }

    public void setCurrentState(ATMState currentState) {
        this.currentState = currentState;
    }

    public int getTotalBalance() {
        return totalBalance;
    }
}
