package my_library;

import java.util.Scanner;

public class Input {
    public static int inputChoose(int left, int rigth){
        System.out.print("Nhập vào lựa chọn chọn của bạn: ");
        int choose;
        while (true){
            try{
                choose = new Scanner(System.in).nextInt();
                if (choose<left || choose>rigth){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập không hợp lệ, vui lòng nhập lại: ");
            }
        }
        return choose;
    }
}
