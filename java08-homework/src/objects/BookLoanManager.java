package objects;

public class BookLoanManager {
    private Reader reader;
    private Book[] books;
    private int[] numberOfBook;

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int[] getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(int[] numberOfBook) {
        this.numberOfBook = numberOfBook;
    }
}
