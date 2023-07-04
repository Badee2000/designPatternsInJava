package templateMethod;

public class Builder extends Worker {

    public Builder(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Build");
    }

}
