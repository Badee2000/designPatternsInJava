package templateMethod;

public abstract class Worker {

    String name;

    public Worker(String name) {
        this.name = name;
    }

    public void wakeUp() {
        System.out.println("Wake Up");
    }

    public void goToWork() {
        System.out.println("Go To Work");
    }

    public abstract void work();

    public void goBack() {
        System.out.println("Go Back");
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public void doDailyRoutine() {
        wakeUp();
        goToWork();
        work();
        goBack();
        sleep();
    }
}
