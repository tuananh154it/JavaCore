package HomeWord;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so luong phan tu cua day: ");
        int[] arr = NhapDay(n);
        XuatMang(arr, n);
    }

    public static int[] NhapDay(int n) {
        int[] arr = new int[n];
        int count = 0;
        do {
            arr[count] = NhapSo("nhap vao mot so nguyen khac cac so da co: ");
            if (KTTrungNhau(arr, count, arr[count])) {
                count++;
            } else {
                System.out.println("so ban nhap khong thoa man, vui long nhap lai !!!");
            }
        } while (count != n);
        return arr;
    }

    public static boolean KTTrungNhau(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return false;
            }
        }
        return true;
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
}
// Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau.
// Nếu nhập một số đã có thì yêu cầu nhập lại.
// Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.