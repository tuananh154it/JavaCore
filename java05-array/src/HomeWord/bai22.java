package HomeWord;

import java.nio.charset.CharsetEncoder;
import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so luong phan tu mang: ");
        int[] arr = NhapMang(n);
        SapXep(arr, n);
        XuatMang(arr, n);
        int x = NhapSo("nhap gia tri x can chen: ");
        int[] arrKetQua = Chen(arr, n, x);
        XuatMang(arrKetQua, arrKetQua.length);
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

    public static void SapXep(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] Chen(int[] arr, int n, int x) {
        int[] ketQua = new int[n + 1];
        int index = 0;
        for (int i = 0; i < n + 1; i++) {
            if (x <= arr[i]) {
                ketQua[i] = x;
                index = i;
                break;
            }
            if (i == n + 1) {
                ketQua[i] = x;
                index = i;
            }
        }
        for (int i = 0; i < n + 1; i++) {
            if (i < index) {
                ketQua[i] = arr[i];
            }
            if (i > index) {
                ketQua[i] = arr[i - 1];
            }
        }
        return ketQua;
    }
}
//Th???c hi???n nh???p v??o m???t m???ng s??? nguy??n a c?? n ph???n t??? (n>0) v?? m???t gi?? tr??? th???c x.
// Th???c hi???n s???p x???p m???ng a theo th??? t??? t??ng d???n v?? ch??n gi?? tr??? x v??o trong
// m???ng a sao cho v???n gi??? ???????c t??nh s???p x???p c???a m???ng.