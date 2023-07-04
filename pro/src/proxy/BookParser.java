package proxy;

public class BookParser implements IBookParser {

    private int numPages;
    private int numWords;
    private int numChapters;

    public BookParser(String book) {
        System.out.println("Parsing Book...");
        numPages = 1;
        numWords = 8;
        numChapters = 3;
    }

    public int getNumPages() {
        return numPages;
    }

    public int getNumWords() {
        return numWords;
    }

    public int getNumChapters() {
        return numChapters;
    }

}
