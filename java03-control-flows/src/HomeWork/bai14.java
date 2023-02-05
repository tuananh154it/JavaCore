package HomeWork;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        System.out.print("nhap so tu nhien n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("cac so chan nho hon"+ n+" la: ");
        for(int i = 0;i<=n ;i+=2){
            System.out.println(i);
        }
        System.out.println("cac so le nho hon "+n+" la: ");
        for(int i = 1; i<=n;i+=2){
            System.out.println(i);
        }
    }
}
//Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.