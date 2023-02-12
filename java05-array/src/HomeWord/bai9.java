package HomeWord;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        System.out.print("nhap so luong phan tu trong mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = NhapMang(n);
        System.out.println(Arrays.toString(a));
        InPTKhacNhau(a, n);
    }

    public static int[] NhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            ;
        }
        return arr;
    }

    public static void InPTKhacNhau(int[] arr, int n) {
        int[] count = new int[101];
        for (int temp : arr) {
            count[temp]++;
        }
        for (int i = 1; i < 101; i++) {
            if (count[i] != 0) {
                System.out.println(i);
            }
        }
    }
}
//    Viết chương trình tạo ngẫu nhiên mảng a gồm N phần tử bao gồm các số nguyên. In ra các số khác nhau trong dãy.