package objects;

import constants.Major;

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
        System.out.println("Nhập tên chuyên ngành: \n1. Khoa học tự nhiên \n2. Văn học - Nghệ thuật \n3. Điện tử viễn thông \n4. Công nghệ thông tin" );
        int choose = inputIntegerNumber("Nhập lựa chọn của bạn: ",1,4);
        switch (choose){
            case 1:
                this.major = Major.KHTN.getMajor();
                break;
            case 2:
                this.major = Major.VHNT.getMajor();
                break;

            case 3:
                this.major = Major.DTVT.getMajor();
                break;
            case 4:
                this.major = Major.CNTT.getMajor();
                break;
        }
        System.out.print("Nhập năm xuất bản: ");
        this.yearOfProduction = new Scanner(System.in).nextInt();
    }
    // method nhập số nguyên có điều kiện
    private int inputIntegerNumber(String comment,int left,int right){
        do {
            System.out.print(comment);
            int num = new Scanner(System.in).nextInt();
            if(num >= left && num<=right){
                return num;
            }
            System.out.println("Không hợp lệ, yêu cầu nhập lại !!!");
        }while (true);
    }
    public void print() {
        System.out.printf("%-15d", this.bookCode);
        System.out.printf("%-30s", this.bookName);
        System.out.printf("%-20s", this.author);
        System.out.printf("%-25s", this.major);
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

}
