package HomeWord;

import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        int m = NhapSo("nhap m: ");
        int n = NhapSo("nhap n: ");
        if (KTSoNT(m) && KTSoNT(n)) {
            System.out.println(m + " va " + n + " cung nguyen to");
            return;
        }
        System.out.println(m + " va " + n + " Khong cung nguyen to");
    }

    public static int NhapSo(String ThongDiep) {
        System.out.print(ThongDiep);
        return new Scanner(System.in).nextInt();
    }

    public static boolean KTSoNT(int x) {
        if (x < 2) {
            return false;
        }
        int canX = (int) Math.sqrt(x);
        for (int i = 2; i <= canX; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//Nhập 2 số tự nhiên m,n rồi kiểm tra xem chúng có nguyên tố cùng nhau không.