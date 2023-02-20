import objects.Book;
import objects.BookLoanManager;
import objects.Reader;

import java.util.Scanner;

public class Main {
    static Book[] books = new Book[100];
    static int numberOfBook = 0;
    static Reader[] readers = new Reader[100];
    static int numberOfReader = 0;
    static BookLoanManager[] bookLoanManagers = new BookLoanManager[100];
    static int numberOfBookBorrower = 0;
    //main
    public static void main(String[] args) {
        fn();
    }

    // method điều khiển toàn bộ chương trình
    public static void fn() {
        do {
            printMenu();
            int choose = inputIntegerNumber("Nhập vào lựa chọn của bạn: ",1,7);
            switch (choose) {
                case 1:
                    inputBooks();
                    printBookList();
                    break;
                case 2:
                    inputReaders();
                    printReaderList();
                    break;
                case 3:
                    bookLoanManeger();
                    printBookLoanManagerList();
                    break;
                case 4:
                    sortByNumberOfBook();
                    printBookLoanManagerList();
                    break;
                case 5:
                    sortByName();;
                    printBookLoanManagerList();
                    break;
                case 6:
                    findAndPrintByName();
                    break;
                case 7:
                    break;
            }
            if (choose == 7) {
                System.out.println("Đã thoát chương trình");
                break;
            }

        } while (true);
    }
    // in menu ra màn hình
    public static void printMenu() {
        System.out.println("+-------------------------------- MENU -------------------------------+");
        System.out.println("|  1. Nhập danh sách đầu sách mới. In ra danh sách các đầu sách đã có |");
        System.out.println("|  2. Nhập danh sách bạn đọc mới. In ra danh sách bạn đọc đã có       |");
        System.out.println("|  3. Nhập và In danh sách quản lý mượn sách                          |");
        System.out.println("|  4. Sắp xếp danh sách theo Số lượng cuốn sách được mượn (giảm dần)  |");
        System.out.println("|  5. Sắp xếp danh sách theo tên bạn đọc                              |");
        System.out.println("|  6. Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc       |");
        System.out.println("|  7. Thoát chương trình                                              |");
        System.out.println("+---------------------------------------------------------------------+");
    }
    // nhập vào số nguyên và kiểm tra xong có thuộc khoảng [left;right] không
    public static int inputIntegerNumber(String comment,int left,int right){
        do {
            System.out.print(comment);
            int num = new Scanner(System.in).nextInt();
            if(num >= left && num<=right){
                return num;
            }
            System.out.println("Không hợp lệ, yêu cầu nhập lại !!!");
        }while (true);
    }

    // nhập thêm sách sách mới vào thư viện
    public static void inputBooks() {
        int numberOfNewBook = inputIntegerNumber("Nhập số lượng đầu sách mới: ",0,books.length - numberOfBook);
        numberOfBook += numberOfNewBook;
        for (int i = numberOfBook - numberOfNewBook; i < numberOfBook; i++) {
            books[i] = new Book();
            System.out.println("Nhập thông tin đầu sách thứ " + (i + 1));
            books[i].input();
        }
    }
    // in danh sách đầu sách có trong thư viện
    public static void printBookList() {
        if (numberOfBook == 0) {
            System.out.println("Thư viện chưa có sách, hãy nhập sách vào");
            return;
        }
        System.out.println("======================================= DANH SÁCH ĐẦU SÁCH ĐÃ CÓ ===============================================");
        System.out.printf("%-10s", "STT");
        System.out.printf("%-15s", "MÃ SÁCH");
        System.out.printf("%-30s", "TÊN SÁCH");
        System.out.printf("%-20s", "TÁC GIẢ");
        System.out.printf("%-25s", "CHUYÊN NGÀNH");
        System.out.printf("%-20s\n", "NĂM XUẤT BẢN");
        for (int i = 0; i < numberOfBook; i++) {
            System.out.printf("%-10d", (i + 1));
            books[i].print();
        }
        System.out.println("================================================================================================================");
    }
    //Nhập danh sách bạn đọc mới
    public static void inputReaders(){
        int numberOfNewReader = inputIntegerNumber("Nhập số lượng bạn đọc mới: ",0, readers.length-numberOfReader);
        numberOfReader+=numberOfNewReader;
        for(int i = numberOfReader - numberOfNewReader;i<numberOfReader;i++){
            System.out.println("Nhập thông tin cho bạn đọc thứ "+(i+1));
            readers[i] = new Reader();
            readers[i].input();
        }
    }
    public static  void printReaderList(){
        if(numberOfReader == 0){
            System.out.println("Thư viện chưa có bạn đọc nào,  vui lòng nhập thêm bạn đọc");
            return;
        }
        System.out.println("================================================== DANH SÁCH BẠN ĐỌC =======================================================");
        System.out.printf("%-10s","STT");
        System.out.printf("%-30S","TÊN");
        System.out.printf("%-30s","ĐỊA CHỈ");
        System.out.printf("%-20s","SĐT");
        System.out.printf("%-20s","MÃ BẠN ĐỌC");
        System.out.printf("%-30s\n","LOẠI BẠN ĐỌC");
        for (int i = 0 ;i<numberOfReader;i++){
            System.out.printf("%-10d",(i+1));
            readers[i].print();
        }
        System.out.println("============================================================================================================================");
    }
    // quản lý mượn sách
    public static void bookLoanManeger(){
        int numberOfNewBookBorrower = inputIntegerNumber("Nhập số lượng người mượn sách: ",0,bookLoanManagers.length - numberOfBookBorrower);
        numberOfBookBorrower+= numberOfNewBookBorrower;
        for(int i = numberOfBookBorrower-numberOfNewBookBorrower ;i<numberOfBookBorrower ;i++){
            System.out.println("nhập thông tin người mượn thứ "+(i+1));
            bookLoanManagers[i] = new BookLoanManager();
            bookLoanManagers[i].input(books,numberOfBook);
        }
    }
    public static void printBookLoanManagerList(){
        if(numberOfBookBorrower==0){
            System.out.println("Chưa có người mượn sách !!!");
        }
        System.out.println("==================================== QUẢN LÝ MƯỢN SÁCH =======================================================");
        System.out.printf("%-30s","TÊN BẠN ĐỌC");
        System.out.printf("%-20s","MÃ BẠN ĐỌC");
        System.out.printf("%-30s","TÊN SÁCH");
        System.out.printf("%-20s","MÃ SÁCH");
        System.out.printf("%-20s\n","SỐ LƯỢNG");
        for(int i = 0;i<numberOfBookBorrower;i++){
            bookLoanManagers[i].print();
            System.out.println("--------------------------------------------------------------------------------------------------------------");
        }
    }
    //Sắp xếp theo số lượng sách giảm dần
    // sắp xếp theo tên bạn đọc
    public static void sortByName(){
        for(int i = 0 ;i < numberOfBookBorrower - 1; i++){
            for(int j = i+1;j < numberOfBookBorrower ;j++){
                if(bookLoanManagers[i].getNameReader().compareToIgnoreCase(bookLoanManagers[j].getNameReader()) > 0){
                    BookLoanManager temp = bookLoanManagers[i];
                    bookLoanManagers[i] = bookLoanManagers[j];
                    bookLoanManagers[j] = temp;
                }
            }
        }
    }
    public static void sortByNumberOfBook(){
        for(int i = 0 ;i < numberOfBookBorrower - 1; i++){
            for(int j = i+1;j<numberOfBookBorrower ;j++){
                if(bookLoanManagers[i].getNumberOfAllBook() > bookLoanManagers[j].getNumberOfAllBook()){
                    BookLoanManager temp = bookLoanManagers[i];
                    bookLoanManagers[i] = bookLoanManagers[j];
                    bookLoanManagers[j] = temp;
                }
            }
        }
    }
    // tìm kiếm và hiểu thị danh sách theo tên bạn đọc
    public static void findAndPrintByName(){
        System.out.print("Nhập tên cần tìm kiếm: ");
        String findName = new Scanner(System.in).nextLine();
        System.out.println("==================================== QUẢN LÝ MƯỢN SÁCH THEO TÊN ==============================================");
        System.out.printf("%-30s","TÊN BẠN ĐỌC");
        System.out.printf("%-20s","MÃ BẠN ĐỌC");
        System.out.printf("%-30s","TÊN SÁCH");
        System.out.printf("%-20s","MÃ SÁCH");
        System.out.printf("%-20s\n","SỐ LƯỢNG");
        for(int i = 0 ; i< numberOfBookBorrower;i++){
            if(bookLoanManagers[i].getNameReader().compareToIgnoreCase(findName) == 0){
                bookLoanManagers[i].print();
                System.out.println("--------------------------------------------------------------------------------------------------------------");
            }
        }
    }


}
