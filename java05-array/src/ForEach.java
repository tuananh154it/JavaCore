import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        int n =NhapSo("nhap so phan tu cua mang: ");
        int[] arr = NhapMang(n);
        SapXep(arr,n);
        System.out.println("mang sau khi sap xep");
        XuatMang(arr,n);
        int x= NhapSo("nhap vao so x can chen");
        int[] ketqua = chen(arr,n,x);
        XuatMang(ketqua, ketqua.length);
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
    public static int[] chen(int[] arr, int n,int x){
        int[] ketQua = new int[arr.length + 1];
        int index = 0 ;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<=x && x<=arr[i+1]){
                index = i+1;
                break;
            }
        }
        for (int i = 0; i < ketQua.length; i++) {
            if (i< index){
                ketQua[i] = arr[i];
            }
            if(i == index){
                ketQua[i] = x;
            }
            if(i>index){
                ketQua[i] = arr[i-1];
            }
        }
        return ketQua;
    }

}
