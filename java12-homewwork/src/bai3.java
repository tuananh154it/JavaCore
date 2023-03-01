import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi: ");
        String str = new Scanner(System.in).nextLine();
        fn(str);
    }

    private static void fn(String str) {
        str = str.toLowerCase().trim();
        String regex ="\\s+";
        String[] s = str.split(regex);
        for(int i = 0; i< s.length;i++){
            for(int j = 0 ;j< s[i].length();j++){
                if(j == 0 ){
                    String temp = new String(s[i]);
                    temp = temp.toUpperCase();
                    System.out.print(temp.charAt(0));
                }else {
                    System.out.print(s[i].charAt(j));
                }
            }
            if(i != s.length -1){
                System.out.print(" ");
            }
        }
    }
}
//Viết chương trình thực hiện chuẩn hoá một xâu ký tự
// nhập từ bàn phím (loại bỏ các dấu cách thừa, chuyển
// ký tự đầu mỗi từ thành chữ hoa, các ký tự khác thành chữ thường)