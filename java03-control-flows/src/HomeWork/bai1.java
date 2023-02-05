package HomeWork;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.print("nhap a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("nhap b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.print("nhap c: ");
        int c = new Scanner(System.in).nextInt();
        System.out.print("nhap d: ");
        int d = new Scanner(System.in).nextInt();
        // thuat toan
        if (a >= b && a >= c && a >= d) {
            System.out.println(a + " la so lon nhat");
        } else if (b >= a && b >= c && b >= d) {
            System.out.println(b + " la so lon nhat");
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(c + " la so lon nhat");
        } else {
            System.out.println(d + " la so lon nhat");
        }
    }
}
//Viết chương trình nhập vào 4 số nguyên a, b, c và d. In ra màn hình kết quả xem số nào lớn nhất trong 4 số vừa nhập.