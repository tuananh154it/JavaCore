import java.util.Scanner;

public class FindLastMaxNumber {
    public static void main(String[] args) {
        int n = NhapSo("Nhap so luong phan tu cua mang: ");
        int[] arr = NhapMang(n);
        XuatMang(arr,n);
        FindLastMax(arr,n);
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
    public static void FindLastMax(int[] arr, int n){
        int max =arr[0];
        int LastIndex = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] >= max){
                max = arr[i];
                LastIndex = i;
            }
        }
        System.out.println("phan tu lon nhat la "+max+" tai vi tri cuoi cung la: "+ LastIndex);
    }
}
