package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int a,b;
        try {
            System.out.print("Nhap a: ");
            a = new Scanner(System.in).nextInt();
        }catch (InputMismatchException){
             
        }

        System.out.print("Nhap b: ");
        b = new Scanner(System.in).nextInt();
        try{
            int c =a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("khong the chia cho 0");
        }
        System.out.println("Dung chuong trinh");
    }
}
