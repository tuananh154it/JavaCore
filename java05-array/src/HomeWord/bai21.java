package HomeWord;

import java.util.Scanner;

public class bai21 {
    public static void main(String[] args) {
        int n = NhapSo("Nhap so luong phan tu cua mang: ");
        int[] arr = NhapMang(n);
        TimMinMax(arr, n);
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

    public static void TimMinMax(int[] arr, int n) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max la: " + max);
        System.out.println("min la: " + min);
    }
}
//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0). Tìm số lớn nhất và nhỏ nhất trong mảng a.