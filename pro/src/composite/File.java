package composite;

public class File extends FileSystem{

    private String name;
    private double size;

    public File(String name, double size)
    {
        this.name = name;
        this.size = size;
    }

    @Override
    public void add(FileSystem fs) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void remove(FileSystem fs) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
    
}
