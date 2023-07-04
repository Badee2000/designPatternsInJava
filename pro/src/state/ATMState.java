package state;

public interface ATMState {

    public void insertCard();

    public void ejectCard();

    public void insertPW(String PW);

    public void requestCash(int amount);

}
