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

    public static void main(String[] args) {
        fn();

    }

    // method điều khiển toàn bộ chương trình
    public static void fn() {
        do {
            printMenu();
            int choose = inputChoose();
            switch (choose) {
                case 1:
                    inputBooks(books);
                    printBookList(books);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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

    public static int inputChoose() {
        do {
            System.out.print("Nhập lựa chọn của bạn: ");
            int choose = new Scanner(System.in).nextInt();
            if (choose > 0 && choose <= 7) {
                return choose;
            }
            System.out.println("Không hợp lệ, yêu cầu nhập lại !!!");
        } while (true);
    }

    // in menu ra màn hình
    public static void printMenu() {
        System.out.println("+-------------------------------- MENU -------------------------------+");
        System.out.println("|  1. Nhập danh sách đầu sách mới. In ra danh sách các đầu sách đã có |");
        System.out.println("|  2. Nhập danh sách bạn đọc mới. In ra danh sách bạn đọc đã có       |");
        System.out.println("|  3. In danh sách quản lý mượn sách                                  |");
        System.out.println("|  4. Sắp xếp danh sách theo Số lượng cuốn sách được mượn (giảm dần)  |");
        System.out.println("|  5. Sắp xếp danh sách theo tên bạn đọc                              |");
        System.out.println("|  6. Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc       |");
        System.out.println("|  7. Thoát chương trình                                              |");
        System.out.println("+---------------------------------------------------------------------+");
    }

    // nhập thêm sách sách mới vào thư viện
    public static void inputBooks(Book[] books) {
        int numberOfNewBook;
        do {
            System.out.println("Nhập số lượng đầu sách mới: ");
            numberOfNewBook = new Scanner(System.in).nextInt();
            if (numberOfNewBook >= 0) {
                break;
            }
            System.out.println("Không hợp lệ yêu cầu nhập lại");
        } while (true);
        numberOfBook += numberOfNewBook;
        for (int i = numberOfBook - numberOfNewBook; i < numberOfBook; i++) {
            books[i] = new Book();
            System.out.println("Nhập thông tin đầu sách thứ " + (i + 1));
            books[i].input();
        }
    }

    // in danh sách đầu sách có trong thư viện
    public static void printBookList(Book[] books) {
        if (numberOfBook == 0) {
            System.out.println("Thư viện chưa có sách, hãy nhập sách vào");
        }
        System.out.println("======================================= DANH SÁCH ĐẦU SÁCH ĐÃ CÓ ==========================================");
        System.out.printf("%-10s", "STT");
        System.out.printf("%-15s", "MÃ SÁCH");
        System.out.printf("%-30s", "TÊN SÁCH");
        System.out.printf("%-20s", "TÁC GIẢ");
        System.out.printf("%-20s", "CHUYÊN NGÀNH");
        System.out.printf("%-20s\n", "NĂM XUẤT BẢN");
        for (int i = 0; i < numberOfBook; i++) {
            System.out.printf("%-10d", (i + 1));
            books[i].print();
        }
        System.out.println("===========================================================================================================");
    }

}
