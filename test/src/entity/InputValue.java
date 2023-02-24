package entity;

import java.util.Scanner;

public class InputValue {
    public static int inputIntegerNumber(String str, int left, int right){
        int num;
        do{
            System.out.print(str);
            num = new Scanner(System.in).nextInt();
            if(num >= left && num<=right){
                return num;
            }
            System.out.println("Nhập không thoả mãn, yêu cầu nhập lại !!!");
        }while (true);
    }
    public static int inputIntegerNumber(String str, int left){
        int num;
        do{
            System.out.print(str);
            num = new Scanner(System.in).nextInt();
            if(num >= left){
                return num;
            }
            System.out.println("Nhập không thoả mãn, yêu cầu nhập lại !!!");
        }while (true);
    }
}
