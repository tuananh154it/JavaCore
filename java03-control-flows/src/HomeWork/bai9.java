package HomeWork;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        System.out.print("nhap vao do cao h: ");
        int h = new Scanner(System.in).nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
/*Viết chương trình nhập số nguyên h và in ra màn hình tam giác vuông cân đặc có độ cao h. Ví dụ với h=4:

 *
 *  *
 *  *  *
 *  *  *  *

 */