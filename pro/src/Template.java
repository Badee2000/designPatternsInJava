import templateMethod.Builder;
import templateMethod.Worker;
import templateMethod.Teacher;

public class Template {
    public static void main(String[] args) {
        Teacher badee = new Teacher("Badee");
        Builder ali = new Builder("Ali");
        Worker doub = new Builder("Doub");
        badee.doDailyRoutine();
        ali.doDailyRoutine();
        doub.doDailyRoutine();
    }
}
