package HomeWork;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        System.out.println("nhap 2 so m,n so cho m<n");
        System.out.print("nhap m: ");
        int m = new Scanner(System.in).nextInt();
        System.out.print("nhap n: ");
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        System.out.println("cac so chinh phuong trong doan [" + m + ";" + n + "] la: ");
        for (int i = m; i <= n; i++) {
            int canI = (int) Math.sqrt(i);
            if (Math.pow(canI, 2) == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("co " + count + " so chinh phuong trong doan [" + m + ";" + n + "]");
    }
}
//Nhập vào 2 số tự nhiên m và n, sao cho m < n. Hãy liệt kê các số chính
// phương trong đoạn [m,n]. Có bao nhiêu số chính phương?