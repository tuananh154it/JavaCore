package objects;

import java.util.Scanner;

public class Book {
    private static int AUTO_BOOK_CODE = 10000;
    private final int bookCode;
    private String bookName;
    private String author;
    private String major;
    private int yearOfProduction;

    public Book() {
        bookCode = AUTO_BOOK_CODE;
        AUTO_BOOK_CODE++;
    }

    public Book(String bookName, String author, String major, int yearOfProduction) {
        this.bookCode = AUTO_BOOK_CODE;
        AUTO_BOOK_CODE++;
        this.bookName = bookName;
        this.author = author;
        this.major = major;
        this.yearOfProduction = yearOfProduction;
    }

    public void input() {
        System.out.print("Nhập tên sách: ");
        this.bookName = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên tác giả: ");
        this.author = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên chuyên ngành: ");
        this.major = new Scanner(System.in).nextLine();
        System.out.print("Nhập năm xuất bản: ");
        this.yearOfProduction = new Scanner(System.in).nextInt();
    }

    public void print() {
        System.out.printf("%-15d", this.bookCode);
        System.out.printf("%-30s", this.bookName);
        System.out.printf("%-20s", this.author);
        System.out.printf("%-20s", this.major);
        System.out.printf("%-20d\n", this.yearOfProduction);
    }

    public int getBookCode() {
        return bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookCode=" + bookCode +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", major='" + major + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
