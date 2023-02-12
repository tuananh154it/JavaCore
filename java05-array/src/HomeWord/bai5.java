package HomeWord;

import java.util.Arrays;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int[] arrs = NhapMang();
        System.out.println(Arrays.toString(arrs));
        SoLonThu2(arrs);
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

    public static void SoLonThu2(int[] arrs) {
        int leng = arrs.length;
        int[] arrsSXTang = arrs.clone();
        SapXepTang(arrsSXTang);
        int max2 = arrsSXTang[leng - 1];
        for (int i = leng - 2; i >= 0; i--) {
            if (max2 != arrsSXTang[i]) {
                max2 = arrsSXTang[i];
                break;
            }
        }
        if (max2 == arrsSXTang[leng - 1]) {
            System.out.println("khong co so lon thu 2");
            return;
        }
        System.out.println("so lon thu 2 la " + max2 + " tai cac vi tri: ");
        for (int i = 0; i < leng; i++) {
            if (arrs[i] == max2) {
                System.out.println(i + 1);
            }
        }
    }
}
//Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1].
// Tìm số lớn thứ hai và vị trí của nó trong dãy. Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.