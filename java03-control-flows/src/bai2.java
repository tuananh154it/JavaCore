import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.print("nhap n: ");
        int n = new Scanner(System.in).nextInt();
        float S= 0;
        for(int i = 1; i<=n; i++){
            S+=(float)1/i;
        }
        System.out.println("tong la: "+S);
    }
}
