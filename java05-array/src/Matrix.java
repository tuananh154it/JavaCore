import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int dong = NhapSo("Nhap so dong: ");
        int cot = NhapSo("Nhap so cot: ");
        int[][] arr = NhapMaTran(dong,cot);
        XuatMaTran(arr);
    }
    public static int[][] NhapMaTran(int dong, int cot){
        int[][] arr = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                arr[i][j] = NhapSo("Nhap arr["+i+"]["+j+"] = ");
            }
        }
        return arr;
    }
    public static int[][] XuatMaTran(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%6d",arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }
    public static int NhapSo(String ThongDiep){
        System.out.print(ThongDiep);
        return new Scanner(System.in).nextInt();
    }
}
