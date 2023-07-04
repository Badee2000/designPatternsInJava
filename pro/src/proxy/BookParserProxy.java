package proxy;

public class BookParserProxy implements IBookParser {

    private String book;
    private BookParser parser;

    public BookParserProxy(String book) {
        this.book = book;
        this.parser = null;
    }

    public int getNumPages() {
        if (parser == null) {
            parser = new BookParser(this.book);
        }
        return parser.getNumPages();
    }

    public int getNumWords() {
        if (parser == null) {
            parser = new BookParser(this.book);
        }
        return parser.getNumWords();
    }

    public int getNumChapters() {
        if (parser == null) {
            parser = new BookParser(this.book);
        }
        return parser.getNumChapters();
    }

}