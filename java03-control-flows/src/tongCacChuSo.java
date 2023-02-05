import java.util.Scanner;

public class tongCacChuSo {
    public static void main(String[] args) {
        System.out.print("nhap vao chu so n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        int nCopy = n;
        while (nCopy != 0) {
            S += nCopy % 10;
            nCopy /= 10;
        }
        System.out.println("tong cac chu so cua " + n + " la: " + S);
    }
}
