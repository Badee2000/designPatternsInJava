package composite;

import java.util.ArrayList;

public class Folder extends FileSystem {

    private String name;
    private ArrayList <FileSystem> children;

    public Folder(String name)
    {
        this.name = name;
        children = new ArrayList<>();
        // children = new ArrayList<FileSystem>();
    }

    @Override
    public void add(FileSystem fs) {
        children.add(fs);
    }

    @Override
    public void remove(FileSystem fs) {
        children.remove(fs);
    }

    @Override
    public double getSize() {
        double size = 0.0;
        for(FileSystem fs:children)
        {
            size+=fs.getSize();
        }
        return size;
    }

    public String getName() {
        return name;
    }
}
