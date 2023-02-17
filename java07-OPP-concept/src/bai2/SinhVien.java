package bai2;

import java.util.Scanner;

public class SinhVien {
    String id;
    String name;
    String Class;
    int grade;

    public SinhVien() {
    }

    ;

    public void khaiBaoThongTin() {
        System.out.print("Nhập mã sinh viên: ");
        this.id = new Scanner(System.in).nextLine();
        System.out.print("Nhập tên sinh viên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập lớp: ");
        this.Class = new Scanner(System.in).nextLine();
        System.out.print("Nhập khoá: ");
        this.grade = new Scanner(System.in).nextInt();
    }

    public void inThongTin() {
        System.out.printf("%-20s", this.id);
        System.out.printf("%-30s", this.name);
        System.out.printf("%-15s", this.Class);
        System.out.printf("%-10d\n", this.grade);
    }
}
