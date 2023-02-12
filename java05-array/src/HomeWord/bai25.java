package HomeWord;

import java.util.Scanner;

public class bai25 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so luong phan tu: ");
        int[] arr = NhapMang(n);
        XuatMang(arr, n);
        DemChenLe(arr, n);
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

    public static void DemChenLe(int[] arr, int n) {
        int Chan = 0, le = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                Chan++;
            } else {
                le++;
            }
        }
        System.out.println("so phan tu chan: " + Chan);
        System.out.println("so phan tu le: " + le);
    }
}
//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0).
// Đếm xem trong mảng có bao nhiêu số lẻ và bao nhiêu số chẵn.