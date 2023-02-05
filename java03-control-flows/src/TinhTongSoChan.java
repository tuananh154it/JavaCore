import java.util.Scanner;

public class TinhTongSoChan {
    public static void main(String[] args) {
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        for (int i = 2; i <= n; i += 2) {
            S += i;
        }
        System.out.println("tong tu 1 den " + n + " la: " + S);
    }
}