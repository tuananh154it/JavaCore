package HomeWord;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so luong phan tu cua mang: ");
        int[] arr = NhapMang(n);
        XuatMang(arr, n);
        System.out.println("mang co doi xung hay ko ? " + KtDoiXung(arr, n));
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

    public static boolean KtDoiXung(int[] arr, int n) {
        for (int i = 0; i <= n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
//Nhập mảng a gồm N phần tử bao gồm các số nguyên dương. Kiểm tra xem a có
// phải là mảng đối xứng hay không (ví dụ: [15 2 1 2 15] là mảng đối xứng).