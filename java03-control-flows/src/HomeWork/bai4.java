package HomeWork;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.print("nhap vao so nguyen n: ");
        int n = new Scanner(System.in).nextInt();
        int num = 2;
        int count = 0;
        System.out.println(n + " so nguyen to dau tien la: ");
        while (count != n) {
            boolean mark = true;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    mark = false;
                    break;
                }
            }
            if (mark) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
//Viết chương trình liệt kê n số nguyên tố đầu tiên.