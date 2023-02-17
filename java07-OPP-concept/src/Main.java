import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhap so luong sinh vien: ");
        int n = new Scanner(System.in).nextInt();
        sinh_vien[] sinhviens = new sinh_vien[n];
        for(int i = 0; i<n;i++){
            sinhviens[i] = new sinh_vien();
            sinhviens[i].khaiBaoThongTin();
        }
        System.out.println(Arrays.toString(sinhviens));
    }
}
