import composite.File;
import composite.FileSystem;
import composite.Folder;

public class Composite {
    public static void main(String[] args) {
        FileSystem folder1 = new Folder("fold1");
        FileSystem folder2 = new Folder("fold1");
        FileSystem file1 = new File("fold1", 10);
        FileSystem file2 = new File("fold1", 20);
        System.out.println(folder1.getSize());
        folder1.add(folder2);
        folder2.add(file2);
        folder2.add(file1);
        System.out.println(folder1.getSize());
    }
}
