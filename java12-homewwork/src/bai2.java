import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.print("Nhập vào chuổi: ");
        String str = new Scanner(System.in).nextLine();
        fn(str);
    }

    private static void fn(String str) {
        String strLow = str.toLowerCase();
        String strUp = str.toUpperCase();
        for(int i = 0;i<str.length();i++){
            if(i%2 == 0){
                System.out.print(strUp.charAt(i));
            }else {
                System.out.print(strLow.charAt(i));
            }

        }
    }
}
//Viết chương trình nhập vào một xâu ký tự s bất kỳ,
// sau đó chuyển sang dạng xen kẽ chữ in hoa và chữ in thường.
// Ví dụ s = ABCDefgh thì kết quả là AbCdEfGh