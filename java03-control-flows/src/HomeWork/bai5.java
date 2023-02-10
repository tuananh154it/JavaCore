package HomeWork;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
//        System.out.print("nhap vao mot so nguyen duong: ");
        String num = new Scanner(System.in).nextLine();
//        String numDao="" ;
//        for(int i =0;i<num.length();i++){
//            numDao =  num.charAt(i) + numDao;
//        }
//        System.out.println(num);
//        System.out.println(numDao);
        for (int i = 0; i < (num.length() / 2); i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                System.out.println(num + " khong la so thuan nghich");
                return;
            }
        }
        System.out.println(num + " la so thuan nghich");
    }
}
//    Một số được gọi là số thuận nghịch nếu ta đọc từ trái sang phải hay từ phải sang trái số đó ta vẫn nhận được một số
//    giống nhau. Hãy nhập một số và kiểm tra xem số đó có phải số thuật nghịch hay không (ví dụ số: 558855).