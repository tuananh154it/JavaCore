package HomeWord;

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        System.out.print("nhap so tu nhien n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("tong la: " + TinhTong(n));
    }

    public static double TinhTong(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) 1 / i;
        }
        return sum;
    }
}
//s