import java.util.Scanner;

public class DemoTong {
    public static void main(String[] args) {
        System.out.print("nhap vao n: ");
        int n = new Scanner(System.in).nextInt();
        int S = 0;
        for (int i = 1; i <= n; i++) {
            S += i;
        }
        System.out.println("tong tu 1 den " + n + " la: " + S);
        //lam dep code ctrl + alt + L
    }
}
