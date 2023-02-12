package HomeWord;

import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        int n = NhapSo("nhap so luong phan tu: ");
        int[] arr = NhapMang(n);
        XuatMang(arr, n);
        SapXepGiam(arr, n);
        System.out.println("---------Sau khi sap xep giam----------");
        XuatMang(arr, n);
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

    public static void SapXepGiam(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
//Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0).
// Thực hiện sắp xếp mảng theo thứ tự giảm dần.