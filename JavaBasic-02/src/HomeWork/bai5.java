package HomeWork;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
//        // a
        System.out.print("nhập vào một chuỗi ký tự: ");
        String string = new Scanner(System.in).nextLine();
        System.out.print("nhập vào một ký tự: ");
        char ch = new Scanner(System.in).nextLine().charAt(0);
        System.out.println("vị trí xuất hiện đầu tiên của '"+ ch +"' là: " + string.indexOf(ch));
        System.out.println("vị trí xuất hiện cuối cùng của '"+ ch +"' là: " + string.lastIndexOf(ch));
        //b
        System.out.println("--------------------- b------------------");
        System.out.print("nhập vào chuỗi s: ");
        String s =new Scanner(System.in).nextLine();
        System.out.print("nhập vào chuỗi s1: ");
        String s1 =new Scanner(System.in).nextLine();
        System.out.print("nhập vào chuỗi s2: ");
        String s2 =new Scanner(System.in).nextLine();
        System.out.println("s = \""+s+"\"");
        s = s.replace(s1,s2);
        System.out.println("s1 = \""+s1+"\"");
        System.out.println("s2 = \""+s2+"\"");
        System.out.println("sau khi thay thế s = \""+s+"\"");
    }
}
/*a. Nhập vào một chuỗi bất kỳ và một ký tự nào đó. Tìm kiếm vị trí xuất hiện đầu tiên và
cuối cùng của ký tự đó trong chuỗi vừa nhập.
b. Nhập 3 xâu ký tự ký tự s, s1, s2. Tìm tất cả những lần xuất hiện của s1 trong s và thay thế
bằng s2. Xuất s ra màn hình Ví dụ: s = “TIM KIEM VA THAY THE”, s1 = “TH”, s2 =
“123”. Kết quả xâu ký tự s sẽ là: “TIM KIEM VA 123AY 123E”*/