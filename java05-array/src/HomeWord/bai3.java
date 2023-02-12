package HomeWord;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int[] arrs = NhapMang();
        System.out.println("---------Truoc khi sap xep-----------");
        System.out.println(Arrays.toString(arrs));
        System.out.println("---------Sau khi sap xep-------------");
        SapXepTang(arrs);
        System.out.println(Arrays.toString(arrs));
    }

    public static int[] NhapMang() {
        System.out.print("nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] arrs = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            arrs[i] = new Scanner(System.in).nextInt();
        }
        return arrs;
    }

    public static void SapXepTang(int[] arrs) {
        int n = arrs.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrs[i] > arrs[j]) {
                    int temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
    }
}
//    Nhập số n và dãy các số nguyên a[0], a[1],..., a[n-1]
//        rồi sắp xếp dãy trên theo thứ tự tăng dần.