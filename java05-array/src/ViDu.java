import java.sql.SQLOutput;
import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        System.out.print("nhap so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr =NhapMang(n);
        XuatMang(arr,n);
    }
    public static int[] NhapMang(int n){
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] =NhapSo("Nhap phan tu thu "+ (i+1)+": ");
        }
        return arr;
    }
    public static void XuatMang(int[] arr,int n){
        System.out.print("[");
        for (int i = 0 ;i <n;i++){
            System.out.print(arr[i]);
            if(i!= n - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static int NhapSo(String ThongDiep){
        System.out.print(ThongDiep);
        return new Scanner(System.in).nextInt();
    }
}
