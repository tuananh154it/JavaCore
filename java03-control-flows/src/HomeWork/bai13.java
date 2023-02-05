package HomeWork;

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        System.out.print("nhap vao n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        for (int i = 7; i <= n; i += 7) {
            S += i;
        }
        System.out.println("tong cac so tu nhien khong lon hon " + n + " va chia het cho 7 la: " + S);
    }
}
//Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.