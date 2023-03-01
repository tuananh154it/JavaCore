package demo_string;

import java.util.Scanner;

public class Ptbac2 {
    // ax^2 + bx + c = 0
    public static void main(String[] args) {
        System.out.print("nhap a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.print("nhap b: ");
        float b = new Scanner(System.in).nextFloat();
        System.out.print("nhap c: ");
        float c = new Scanner(System.in).nextFloat();
        fn(a,b,c);
    }
    public static void fn(float a, float b, float c){
        if(a== 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("phuong trinh vo so nghiem");
                }else {
                    System.out.println("phuong trinh vo nghiem");
                }
            }else {
                System.out.println("nghiem cua phuong trinh la: "+ (-c/b));
            }
            return;
        }
        double delta = Math.pow(b,2) - 4*a*c;
        if(delta<0){
            System.out.println("phuong trinh vo nghiem");
        }else if(delta == 0){
            System.out.println("nghiem cua phuong trinh la: " +(-b/(2*a)));
        }else {
            System.out.println("x1 = "+ (-Math.sqrt(delta) + b)/(2*a));
            System.out.println("x2 = "+ (Math.sqrt(delta) + b)/(2*a));
        }
    }
}

