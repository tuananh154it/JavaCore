import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int n = NhapSo("Nhap so luong phan tu cua mang: ");
        int[] arr = NhapMang(n);
        XuatMang(arr,n);
        int x = NhapSo("Nhap so x: ");
        if(TimX(arr,n,x) == -1){
            System.out.println("so "+x+" khong xuat hien trong mang");
        }else {
            System.out.println("so "+x+" xuat hien tai vi tri thu "+ TimX(arr,n,x));
        }
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
    public static int TimX(int[] arr,int n,int x){
        int index = -1;
        for(int i = 0 ; i<n ;i++){
            if(arr[i] == x){
                index = i;
                break;
            }
        }
        return index;
    }
}
