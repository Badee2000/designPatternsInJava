package templateMethod;

public class Teacher extends Worker {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Teach");
    }

}
