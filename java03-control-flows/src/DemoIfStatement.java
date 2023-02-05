import java.util.Scanner;

public class DemoIfStatement {
    public static void main(String[] args) {
        // giai av bien luan pt bac nhat mot an ax + b = 0
        System.out.print("nhap va a: ");
        float a = new Scanner(System.in).nextFloat();
        System.out.print("nhap va b: ");
        float b = new Scanner(System.in).nextFloat();
        if(a == 0){
            if(b ==0) {
                System.out.println("pt vo so nghiem");
                return;
            }
                System.out.println("pt vo nghiem");
            return;
        }
            System.out.println("pt co mot nghiem la "+ (-b/a));
    }
}
