import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        String str1 = nhap("Nhập chuỗi 1: ");
        String str2 = nhap("Nhập chuỗi 2: ");
        System.out.println("vi tri: " + timKiem(str1, str2));
    }

    public static String nhap(String cm) {
        System.out.print(cm);
        String str = new Scanner(System.in).nextLine();
        return str;
    }

    private static int timKiem(String str1, String str2) {
        if(str1.length() > str2.length()){
            return -1;
        }
        return str2.indexOf(str1);
    }
}
//Tìm kiếm vị trí xuất hiện đầu tiên của chuỗi S1 trong S2. Nếu không tìm thấy trả về -1.
