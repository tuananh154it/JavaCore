package demo_string;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.print("nhap string: ");
        String str = new Scanner(System.in).nextLine();
        String newStr = "";
        for(int i = 0 ; i < str.length(); i++){
            newStr = str.charAt(i)+ newStr;
        }
        System.out.println(newStr);
    }
}
