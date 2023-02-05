import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.print("nhap vao mot so: ");
        int n = new Scanner(System.in).nextInt();
        switch (n){
            case 2:
                System.out.println("MonDay");
                break;
            case 3:
                System.out.println("TuesDay");
                break;
            case 4:
                System.out.println("WenesDay");
                break;
            case 5:
                System.out.println("ThursDay");
                break;
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
                break;
            case 8:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("so khong hop le");
                break;
        }
    }
}
