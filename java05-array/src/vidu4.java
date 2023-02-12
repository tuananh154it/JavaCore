import java.util.Scanner;

public class vidu4 {
    public static void main(String[] args) {
        int dong = NhapSo("nhap so dong: ");
        int cot = NhapSo("nhap so cot: ");
        int[][] arr1 = NhapMaTran(dong,cot);
        int[][] arr2 = NhapMaTran(dong,cot);
        System.out.println("--------mtran 1----------");
        XuatMaTran(arr1);
        System.out.println("--------mtran 2----------");
        XuatMaTran(arr2);
        System.out.println("--------tong----------");
        XuatMaTran(Tong(arr1,arr2));
    }
    public static int[][] NhapMaTran(int dong, int cot) {
        int[][] arr = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                arr[i][j] = NhapSo("Nhap arr[" + i + "][" + j + "] = ");
            }
        }
        return arr;
    }

    public static int[][] XuatMaTran(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%6d", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    public static int NhapSo(String ThongDiep) {
        System.out.print(ThongDiep);
        return new Scanner(System.in).nextInt();
    }

    public static int[][] Tong(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[arr1.length-1-i][arr1[0].length-1-j];
            }
        }
        return arr3;
    }
}
