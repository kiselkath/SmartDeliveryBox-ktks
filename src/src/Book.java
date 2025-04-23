public class Book {
    private String bookTitle;
    private int bookSize;

    public Book(String bookTitle, int bookSize) {
        this.bookTitle = bookTitle;
        this.bookSize = bookSize;
    }

    //Getter
    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookSize() {
        return bookSize;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookSize=" + bookSize +
                '}';
    }
}
