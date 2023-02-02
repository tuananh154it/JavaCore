import java.util.Scanner;

public class DemoHcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu dai hcn: ");
        int chieuDai = sc.nextInt();
        System.out.println("nhap vao rong dai hcn: ");
        int chieuRong = sc.nextInt();
        System.out.println("dien tich : "+ chieuRong*chieuDai);
        System.out.println("------------------");
        System.out.println("xin moi nhap ten cua ban: ");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
