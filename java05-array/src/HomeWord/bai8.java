package HomeWord;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so luong phan tu cua mang: ");
        int[] arr = NhapMang(n);
        XuatMang(arr, n);
        XuatHienNhieuNhat(arr, n);
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

    public static int TimMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void XuatHienNhieuNhat(int[] arr, int n) {
        int[] count = new int[TimMax(arr, n) + 1];
        for (int temp : arr) {
            count[temp]++;
        }
        int countMax = TimMax(count, count.length);
        for (int i = 0; i < count.length; i++) {
            if (count[i] == countMax) {
                System.out.println("phan tu " + i + " xuat hien nhieu nhat, so lan la: " + count[i]);
            }
        }
    }
}
//Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
// In phần tử có số lần xuất hiện nhiều nhất trong a.