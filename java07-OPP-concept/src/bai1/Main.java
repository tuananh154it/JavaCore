package bai1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.khaiBaoThongTin();
        inDsSinhVien(sv);
    }

    public static void inDsSinhVien(SinhVien sv) {
        System.out.println("--------------------------THÔNG TIN SINH VIÊN------------------------------\n");
        System.out.printf("%-20s", "MÃ SINH VIÊN");
        System.out.printf("%-30s", "TÊN SINH VIÊN");
        System.out.printf("%-15s", "LỚP");
        System.out.printf("%-10s\n", "KHOÁ");
        System.out.println("---------------------------------------------------------------------------");
        sv.inThongTin();
        System.out.println("---------------------------------------------------------------------------");
    }
}
