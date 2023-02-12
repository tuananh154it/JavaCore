package HomeWord;

import javax.swing.*;
import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so hang(cot) cua ma tran vuong: ");
        int[][] a = NhapMang(n, n);
        XuatMang(a, n, n);
        System.out.println("tong duong cheo chinh la: " + TongDuongCheoChinh(a, n));
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

    public static int TongDuongCheoChinh(int[][] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}
//Thực hiện nhập vào ma trận vuông số nguyên a có n dòng và n cột (n>0).
// Tính tổng đường chéo chính của ma trận này