package HomeWork;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("để giải phương trình ax^2 +bx + c =0 ");
        System.out.print("Nhập a khác 0: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.print("Nhập b: ");
        float b = new Scanner(System.in).nextFloat();
        System.out.print("Nhập c: ");
        float c = new Scanner(System.in).nextFloat();
        double canDelta = Math.sqrt(b*b -4*a*c);
        String ketQua = (canDelta >=0) ? ((canDelta == 0) ? ("nghiem kep x = " + ((-b-canDelta)/(2*a))) : ("x1 = "+((-b-canDelta)/(2*a)) +" va x2 = " +((-b+canDelta)/(2*a)))):"vô nghiệm";
        System.out.println("nghiệm của phương trình "+a+" + "+b+"x = 0 là: "+ ketQua);
    }
}
/*Bài 2: Giải và biện luận phương trình bậc hai ax2 + bx + c = 0, với a, b và c nhập vào từ bàn%
phím, a khác 0.
*/