import java.util.Scanner;

public class TongHaiSo {
    public static void main(String[] args) {
        System.out.print("nhap n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(ktSNT(n));
    }
//
//    public int nhapSo() {
//        System.out.print("nhap so: ");
//        return new Scanner(System.in).nextInt();
//    }
//
//    public int tongHaiSo(int a, int b) {
//        int i = a + b;
//        return i;
//    }
//
    public static boolean ktSNT(int n) {
        if (n <= 0) {
            return false;
        }
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static int tongChuSo(int n) {
//        int sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        return sum;
//    }
}
