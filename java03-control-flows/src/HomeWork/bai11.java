package HomeWork;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        System.out.print("nhap so tu nhien n: ");
        int n = new Scanner(System.in).nextInt();
        long S, S1 = 0, S2;
        S = (long)n * (n + 1) / 2;
        for (int i = 1; i <= n; i += 2) {
            S1 += i;
        }
        S2 = S - S1;
        System.out.println("tong cac so tu nhien nho hon " + n + " la: " + S);
        System.out.println("tong cac so tu nhien le nho hon " + n + " la: " + S1);
        System.out.println("tong cac so tu nhien chan nho hon " + n + " la: " + S2);
    }
}
/*
Nhập số tự nhiên n rồi tính các tổng sau:
• S = tổng các số tự nhiên không lớn hơn n.
• S1 = tổng các số tự nhiên lẻ không lớn hơn n.
• S2 = tổng các số tự nhiên chẵn không lớn hơn n.
*/