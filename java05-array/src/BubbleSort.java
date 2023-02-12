import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int n = NhapSo("nhap so luong phan tu: ");
        int[] arr = NhapMang(n);
        XuatMang(arr,n);
        SapXep(arr,n);
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
    public static void SapXep(int[] arr, int n){
        for(int i =0;i<n-1;i++){
            for(int j = i+1 ;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
