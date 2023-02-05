package HomeWork;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        System.out.print("nhap vao n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("nhap vao m: ");
        int m = new Scanner(System.in).nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m) {
                    System.out.print(" * ");
                } else if (j == 1 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
/*Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật rỗng các dấu * kích thước n*m. Ví dụ với n=5, m=4:

 *  *  *  *  *
 *           *
 *           *
 *  *  *  *  *

 */