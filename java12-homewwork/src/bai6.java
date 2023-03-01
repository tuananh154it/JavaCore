import java.util.Arrays;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        String str = nhap();
        inTheoThuTu(str);
    }
    public static String nhap(){
        do {
            System.out.print("Nhập vào một chuỗi ký tự (không quá 20 ký tự, mỗi từ ko quá 10ký tự): ");
            String str = new Scanner(System.in).nextLine();
            if(str.length() <=20 && check(str)){
                return str;
            }
            System.out.println("Nhập sai yêu cầu, vui lòng nhập lại !!!");
        }while(true);
    }
    public static String[] tachTu(String str){
        str = str.toLowerCase().trim();
        String regex ="\\s+";
        String[] s = str.split(regex);
        return  s;
    }
    public static boolean check(String str){
        String[] strs = tachTu(str);
        for(int i = 0; i<strs.length;i++){
            if(strs.length<=10){
                return true;
            }
        }
        return false;
    }
    public static void inTheoThuTu(String str){
        String[] strs = tachTu(str);
        System.out.println(Arrays.toString(strs));
        for(int i = 0; i< strs.length - 1;i++){
            for (int j = i+1; j < strs.length; j++) {
                if (strs[i].compareToIgnoreCase(strs[j]) < 0  ){
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }
        }
        for(int i = strs.length-1 ; i>=0;i--){
            System.out.print(strs[i]);
            if(i!= 0){
                System.out.print(" ");
            }
        }
    }
}
//Bài 6. Nhập một câu không quá 20 từ, mỗi từ không quá 10 ký tự.
// Viết chương trình tách các từ trong câu và in các từ theo thứ tự Alphabet.