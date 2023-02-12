package HomeWord;

import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so luong phan tu mang: ");
        int[] arr = NhapMang(n);
        TinhTBC(arr, n);

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

    public static void TinhTBC(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("TBC la: " + (float) sum / n);
    }
}
//Tính trung bình cộng các phần tử trong một mảng số nguyên được nhập từ bàn phím.