import proxy.BookParserProxy;

public class Proxy {
    public static void main(String[] args) {

        String str = "New Book";
        BookParserProxy book = new BookParserProxy(str);
        System.out.println(book.getNumChapters());
        System.out.println(book.getNumChapters());
        System.out.println(book.getNumPages());
    }
}
