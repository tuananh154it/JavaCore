import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi: ");
        String str = new Scanner(System.in).nextLine();
        fn(str);
    }
    private static void fn(String str) {
        str = str.trim();
        String regex ="\\s+";
        String[] s = str.split(regex);
        for(int i = s.length-1; i>=0 ;i--){
            System.out.print(s[i]);
            if(i != 0){
                System.out.print(" ");
            }
        }
    }
}
//Bài 5. Viết chương trình thực hiện nhập một xâu họ tên theo cấu trúc: họ…đệm…tên;
// chuyển xâu đó sang biểu diễn theo cấu trúc tên…họ…đệm.