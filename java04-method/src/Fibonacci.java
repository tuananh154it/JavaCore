import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(fibbonacci(n));
    }
    public static long fibbonacci(int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        return fibbonacci(n-2)+fibbonacci(n-1);
    }
}
