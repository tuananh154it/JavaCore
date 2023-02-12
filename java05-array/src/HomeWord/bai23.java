package HomeWord;

import java.util.Scanner;

public class bai23 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so dong: ");
        int m = NhapSo("nhap so cot: ");
        int[][] arr = NhapMang(n, m);
        XuatMang(arr, n, m);
        TimMinMax(arr, n, m);
    }

    public static int[][] NhapMang(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = NhapSo("nhap arr[" + i + "][" + j + "] = ");
            }
        }
        return arr;
    }

    public static void XuatMang(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int NhapSo(String ThongDiep) {
        System.out.print(ThongDiep);
        return new Scanner(System.in).nextInt();
    }

    public static void TimMinMax(int[][] arr, int n, int m) {
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("min la: " + min);
        System.out.println("max la: " + max);
    }
}
//Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
// Tìm giá trị lớn nhất và nhỏ nhất của ma trận này.