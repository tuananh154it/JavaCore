package HomeWord;

import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        System.out.print("nhap so tu nhien n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Tong la: " + TinhTong(n));
    }

    public static long TinhTong(int n) {
        long sum = 0;
        for (int i = 7; i <= n; i += 7) {
            sum += i;
        }
        return sum;
    }
}
//Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7