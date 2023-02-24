package logic;

import entity.Reporter;

import java.util.Scanner;

public class Input {
    public static int inputNumber(String cm, int left, int right) {
        do {
            System.out.print(cm);
            int num = new Scanner(System.in).nextInt();
            if (num >= left && num <= right) {
                return num;
            }
            System.out.println("Không hợp lệ, vui lòng nhập lại !!!");
        } while (true);
    }
    public static int inputNumber(String cm, int left) {
        do {
            System.out.print(cm);
            int num = new Scanner(System.in).nextInt();
            if (num >= left) {
                return num;
            }
            System.out.println("Không hợp lệ, vui lòng nhập lại !!!");
        } while (true);
    }

    // tạo mảng để ghi thêm phóng viên mới
    public static Reporter[] addReporter(Reporter[] source,int numberOfNewReporters){
        Reporter[] newReporter = new Reporter[source.length + numberOfNewReporters];
        for(int i = 0; i <  source .length;i++){
            newReporter[i] = new Reporter();
            newReporter[i] = source[i];
        }
        return newReporter;
    }
}
