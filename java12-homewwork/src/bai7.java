import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        String str1 = nhap("Nhập chuỗi 1: ");
        String str2 = nhap("Nhập chuỗi 2: ");
        timKiemVaLoạiBo(str1, str2);
    }

    private static void timKiemVaLoạiBo(String str1, String str2) {
        String newStr = str1.replace(str2, "");
        if (newStr.length() == str1.length()) {
            System.out.println("Trong chuỗi 1 không có chuỗi 2");
            return;
        }
        System.out.println("Trong chuỗi 1 có chuỗi 2");
        System.out.println("sau khi xoa chuoi 2 ra khoi chuoi 1: " + newStr);
    }

    public static String nhap(String cm) {
        System.out.print(cm);
        String str = new Scanner(System.in).nextLine();
        return str;
    }

}
//Nhập hai xâu S1 và S2. Tìm xâu S2 trong S1. Nếu có hãy loại bỏ S2 trong S1.
// Chú ý: phải loại bỏ cho đến khi không tìm được S2 trong S1 nữa.