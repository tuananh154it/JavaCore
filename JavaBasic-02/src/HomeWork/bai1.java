package HomeWork;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("để giải phương trình ax +b =0 ");
        System.out.print("Nhập a khác 0: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.print("Nhập b: ");
        float b = new Scanner(System.in).nextFloat();
        System.out.print("nghiệm của phương trình "+a+" + "+b+"x = 0 là: x = "+ (-b/a));
    }
}

//    Giải và biện luận phương trình bậc nhất ax + b = 0, với a và b nhập vào từ bàn phím, a khác 0.