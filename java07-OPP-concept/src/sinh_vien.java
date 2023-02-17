import java.util.Scanner;

public class sinh_vien {
    int id;
    String name;
    String gender;
    String hometown;
    String faculty;
    float gpa;
    static int  AUTO_ID = 1000;
    public void khaiBaoThongTin(){
        this.id = AUTO_ID ;
        AUTO_ID++;
        System.out.print("nhap ten: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("nhap gioi tinh: ");
        this.gender = new Scanner(System.in).nextLine();
        System.out.print("nhap que quan: ");
        this.hometown = new Scanner(System.in).nextLine();
        System.out.print("nhap ten khoa: ");
        this.faculty = new Scanner(System.in).nextLine();
        System.out.print("nhap gpa: ");
        this.gpa = new Scanner(System.in).nextFloat();
    }
    @Override
    public String toString() {
        return "sinh_vien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", hometown='" + hometown + '\'' +
                ", faculty='" + faculty + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
