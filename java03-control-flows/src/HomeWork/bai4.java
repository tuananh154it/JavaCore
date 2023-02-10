package HomeWork;

import java.util.Scanner;

public class bai4 {
    static boolean isprime(int x){
        int demUoc = 0;
        for(int i = 2; i<=x; i++){
            if(x%i == 0){
                demUoc++;
            }
        }
        if (demUoc ==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print("nhap vao so nguyen n: ");
        int n = new Scanner(System.in).nextInt();
        int num = 2;
//        int count = 0;
//        System.out.println(n + " so nguyen to dau tien la: ");
//        while (count != n) {
//            boolean mark = true;
//            for (int i = 2; i < Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    mark = false;
//                    break;
//                }
//            }
//            if (mark) {
//                System.out.println(num);
//                count++;
//            }
//            num++;
//        }
        //c2
        while (n!=0){
            if(isprime(num)){
                System.out.println(num);
                n--;
            }
            num++;
        }
    }
}
//Viết chương trình liệt kê n số nguyên tố đầu tiên.