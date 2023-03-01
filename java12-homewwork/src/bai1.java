import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        System.out.print("Nhập số cần kiểm tra: ");
        long n = new Scanner(System.in).nextLong();
        if (check(n)){
            System.out.println("số "+n+" có thuận nghịch");
            return;
        }
        System.out.println("số "+n+" không thuận nghịch");
    }
    public static boolean check(long num){
        String str = "" + num;
        int leng = str.length();
        for(int i = 0 ;i <leng/2;i++){
            if(str.charAt(i) != str.charAt(leng-1-i)){
                return false;
            }
        }
        return true;
    }
}
//Bài 1. Sử dụng xâu ký tự để viết hàm kiểm tra số thuận nghịch.
// Áp dụng liệt kê các số thuận nghịch có 6 chữ số.
