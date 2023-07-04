package composite;

public abstract class FileSystem {

    public abstract void add(FileSystem fs);

    public abstract void remove(FileSystem fs);

    public abstract double getSize();

}
