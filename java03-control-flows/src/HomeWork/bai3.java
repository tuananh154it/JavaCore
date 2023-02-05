package HomeWork;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print("nhap a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("nhap b: ");
        int b = new Scanner(System.in).nextInt();

        // tim uoc chung lon nhat (cach lam: trừ đến chết)
        int aCopy = a, bCopy = b;
        while (aCopy != bCopy) {
            int temp;
            if (aCopy > bCopy) {
                temp = bCopy;
                bCopy = aCopy - bCopy;
                aCopy = temp;
            } else {
                temp = aCopy;
                aCopy = bCopy - aCopy;
                bCopy = temp;
            }
        }
        System.out.println("UCLN cua " + a + " va " + b + " la: " + aCopy);

        // boi chung nho nhat ( cach lam:  BCNN = (a*b) / UCLN )
        System.out.println("BCNN cua " + a + " va " + b + " la: " + (a * b / aCopy));
    }
}
//Viết chương trình tìm ước số chung lớn nhất và bội số chung nhỏ nhất của hai số nguyên dương a và b.