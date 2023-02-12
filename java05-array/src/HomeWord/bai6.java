package HomeWord;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so luong phan tu cua mang: ");
        int[] arr = NhapMang(n);
        XuatMang(arr, n);
        int b = NhapSo("nhap b: ");
        int c = NhapSo("nhap c (c>b): ");
        TCB(arr, b, c);
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

    public static void TCB(int[] arr, int b, int c) {
        int sum = 0;
        for (int i = b; i <= c; i++) {
            sum += arr[i];
        }
        System.out.println("trung binh cong cua mang tren doan [" + b + "; " + c + "] la " + (float) sum / (c - b + 1));
    }
}
//Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1] và 2 số
// nguyên b, c (b < c). Tính trung bình cộng các phần tử của dãy nằm trong đoạn [b, c].