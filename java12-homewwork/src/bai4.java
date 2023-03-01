import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi: ");
        String str = new Scanner(System.in).nextLine();
        fn(str);
    }

    private static void fn(String str) {
        str = str.trim();
        String regex ="\\s+";
        String[] s = str.split(regex);
        int max = s[0].length();
        int index = 1;
        for(int i = 0; i< s.length;i++){
            if(max < s[i].length()){
                max = s[i].length();
                index = i + 1;
            }
        }
        System.out.println("Từ dài nhất có "+ max + " Ký tự: "+s[index-1]);
        System.out.println("là từ thứ: "+index);
    }
}
