package objects;

import java.util.Scanner;

public class BookLoanManager {
    private Reader reader = new Reader();
    private Book[] books;
    private int[] numberOfBook; // mảng lưu sô lượng sách

    public Reader getReader() {
        return reader;
    }
    // nhập thông tin mượn sách của một người
    public void input(Book[] booksinlibrary,int numberOfBooks){
        System.out.println("---------- NHẬP THÔNG TIN NGƯỜI MƯỢN -----------");
        reader.input();
        System.out.println("-------------- NHẬP SÁCH CẦN MƯỢN --------------");
        int numberOfBookType = inputIntegerNumber("Nhập số đầu sách cần mượn (số sách<= 5): ",0,5);
        numberOfBook = new int[numberOfBookType];
        this.books = new Book[numberOfBooks];
        for(int i = 0;i<numberOfBookType;i++){
            this.books[i] = new Book();
            this.books[i] = inputBookType(booksinlibrary,numberOfBookType);
            numberOfBook[i] = inputIntegerNumber("Nhập số lượng sách: ",0,3);
        }

    }
    // method nhập đầu sách
    private Book inputBookType(Book[] books, int numberOfBook){

        do{
            System.out.print("Nhập mã sách cần mượn: ");
            int bookCode = new Scanner(System.in).nextInt();
            int indexBookType =findBook(bookCode,books,numberOfBook);
            if(indexBookType != -1){
                return books[indexBookType];
            }
            System.out.println("Mã sách bạn nhập không có trong thư viện, vui lòng nhập mã khác");
        }while (true);
    }
    // kiểm tra xem trong thư viện có mã sách này không
    private int findBook(int bookCode,Book[] books,int numberOfBook){
        int left = 0, right = numberOfBook -1 ;
        int mid;
        while(left<=right){
            mid = (left+right)/2;
            if(books[mid].getBookCode() == bookCode){
                return mid;
            }
            if(books[mid].getBookCode() < bookCode){
                left = mid+1;
            }
            if(books[mid].getBookCode() > bookCode){
                right = mid-1;
            }
        }
        return -1;
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
    //in ra thông tin mượn sách
    public void print(){
        if(books.length == 0){
            return;
        }
        for(int i = 0; i< numberOfBook.length;i++){
            System.out.printf("%-30s",reader.getName());
            System.out.printf("%-20s",reader.getReaderCode());
            System.out.printf("%-30s",books[i].getBookName());
            System.out.printf("%-20s",books[i].getBookCode());
            System.out.printf("%-20s\n",numberOfBook[i]);
        }

    }
    // các hàm getter setter
    public void setReader(Reader reader) {
        this.reader = reader;
    }
    public String getNameReader(){
        return this.reader.getName();
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
    public int getNumberOfAllBook() {
        return sumALLBooks();
    }
    private int sumALLBooks(){
        int sum = 0;
        for(int i = 0; i< numberOfBook.length;i++){
            sum+=numberOfBook[i];
        }
        return sum;
    }

    public void setNumberOfBook(int[] numberOfBook) {
        this.numberOfBook = numberOfBook;
    }
}
