package HomeWord;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        int m = NhapSo("Nhap so hang cua A: ");
        int n = NhapSo("Nhap so cot cua A ( so hang cua B): ");
        int k = NhapSo("Nhap so hang cua B: ");
        int[][] A = NhapMang(m, n);
        int[][] B = NhapMang(n, k);
        System.out.println("---------ma tran 1----------");
        XuatMang(A, m, n);
        System.out.println("---------ma tran 2----------");
        XuatMang(B, n, k);
        int[][] Tich = NhanMaTran(A, B);
        System.out.println("---------A x B----------");
        XuatMang(Tich, m, k);
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

    public static int[][] NhanMaTran(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr[i][j] = 0;
                for (int k = 0; k < arr2.length; k++) {
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return arr;
    }
}
//Viết chương trình tính tích 2 ma trận các số nguyên A cấp mxn và B cấp n x k.