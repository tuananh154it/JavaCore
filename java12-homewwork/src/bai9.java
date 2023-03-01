import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        String str1 = nhap("Nhập chuỗi 1: ");
        String str2 = nhap("Nhập chuỗi 2: ");
        System.out.print("Nhập vị trí k: ");
        int k = new Scanner(System.in).nextInt();
        System.out.println("ket qua: "+ chen(str1,str2,k));
    }

    private static String chen(String str1, String str2, int k) {

        String newString = str2.substring(0,k) + str1 + str2.substring(k);
        return newString;
    }

    public static String nhap(String cm) {
        System.out.print(cm);
        String str = new Scanner(System.in).nextLine();
        return str;
    }
}
//Chèn chuỗi S1 vào chuỗi S2 ở vị trí k biết trước với S1, S2 và k nhập vào từ bàn phím.