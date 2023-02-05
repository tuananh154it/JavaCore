import java.util.Scanner;

public class soSanh {
    public static void main(String[] args) {
        System.out.print("nhap vao a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.print("nhap vao b: ");
        float b = new Scanner(System.in).nextFloat();
        System.out.print("nhap vao c: ");
        float c = new Scanner(System.in).nextFloat();
        if(a>=b && a>=c){
            System.out.println(a+ " la so lon nhat");
        }else if(b>=c && b>=a){
            System.out.println(b+ " la so lon nhat");
        }else {
            System.out.println(c+" la so lon nhat");
        }
    }
}
