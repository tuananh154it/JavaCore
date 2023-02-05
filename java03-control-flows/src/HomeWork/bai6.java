package HomeWork;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        System.out.print("nhap vao mot so nguyen: ");
        int num = new Scanner(System.in).nextInt();
        int S = 0;
        int numCopy = num;
        while (numCopy > 0) {
            int modNum = numCopy % 10;
            S += modNum;
            numCopy /= 10;
        }
        System.out.println("tong cac chu so cua " + num + " la: " + S);
    }
}
//    Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
//        Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4=32