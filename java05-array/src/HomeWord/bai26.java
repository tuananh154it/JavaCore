package HomeWord;

import java.util.Deque;
import java.util.Scanner;

public class bai26 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so luong phan tu: ");
        int[] arr = NhapMang(n);
        XuatMang(arr, n);
        int x = NhapSo("nhap so x: ");
        DemSoLanXuatHienX(arr, n, x);
    }

    public static int[] NhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = NhapSo("Nhap phan tu thu " + (i + 1) + ": ");
        }
        return arr;
    }

    public static void XuatMang(int[] arr, int n) {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i != n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int NhapSo(String ThongDiep) {
        System.out.print(ThongDiep);
        return new Scanner(System.in).nextInt();
    }

    public static void DemSoLanXuatHienX(int[] arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("so lan xuat hien cua " + x + " la: " + count);
    }
}
//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0) và một số nguyên x.
// Đếm số lần xuất hiện của x trong mảng a