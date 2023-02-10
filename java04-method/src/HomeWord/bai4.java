package HomeWord;

import java.util.Date;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int[] arrs = NhapMang();
        System.out.println("so cap phan tu lien tiep bang nhau la " + DemCapPT(arrs));
    }

    public static int[] NhapMang() {
        System.out.print("nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] arrs = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            arrs[i] = new Scanner(System.in).nextInt();
        }
        return arrs;
    }

    public static int DemCapPT(int[] arrs) {
        int count = 0;
        int n = arrs.length;
        for (int i = 0; i < n - 1; i++) {
            if (arrs[i] == arrs[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
//    Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1]. Đếm xem có bao nhiêu cặp 2 phần tử liên tiếp
//        bằng nhau trong dãy trên (tức là đếm số cặp a[i], a[i+1] sao cho a[i] = a[i+1];
//        nếu có trường hợp a[i] = a[i+1] = a[i+2] thì được xem là có 2 cặp).