package HomeWord;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        int m = NhapSo("nhap m: ");
        int n = NhapSo("nhap n (m<n): ");
        InSoCP(m, n);
    }

    public static int NhapSo(String ThongDiep) {
        System.out.print(ThongDiep);
        return new Scanner(System.in).nextInt();
    }

    public static void InSoCP(int m, int n) {
        for (int i = m; i <= n; i++) {
            if (KTSoCp(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean KTSoCp(int x) {
        int y = (int) Math.sqrt(x);
        if (y * y == x) {
            return true;
        }
        return false;
    }
}
//Nhập vào 2 số tự nhiên m và n, sao cho m < n.
// Hãy liệt kê các số chính phương trong đoạn [m,n]. Có bao nhiêu số chính phương?