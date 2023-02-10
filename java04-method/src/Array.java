import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("nhap so phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n;i++){
            System.out.println("nhap gia  tri cho phan tu thu "+(i+1));
            a[i] = new Scanner(System.in).nextInt();
        }
        int Sum = 0;
        for(int i =0;i<n;i++){
            Sum+=a[i];
        }
        System.out.println("tong la: "+Sum);
    }
}
