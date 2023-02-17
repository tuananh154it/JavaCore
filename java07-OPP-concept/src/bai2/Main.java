package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = new Scanner(System.in).nextInt();
        SinhVien[] sv = new SinhVien[n];
        nhapTongTinChoSinhVien(sv, n);
        // a. in danh sách sinh vien
        inDsSinhVien(sv, n);
        // b. sap xep theo ten
        sapXepTheoTen(sv, n);
        System.out.println("\n\n********                     sau khi sắp xếp theo tên                     *********");
        inDsSinhVien(sv, n);
        // c. in theo lớp
        inDSTheoLop(sv, n);
    }

    public static void nhapTongTinChoSinhVien(SinhVien[] sv, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("----------------" + "Nhập thông tin cho sinh viên thứ " + (i + 1) + "---------------");
            sv[i] = new SinhVien();
            sv[i].khaiBaoThongTin();
        }
    }

    public static void inDsSinhVien(SinhVien[] sv, int n) {
        System.out.println("-----------------------------------DS SINH VIÊN--------------------------------------\n");
        System.out.printf("%-10s", "STT");
        System.out.printf("%-20s", "MÃ SINH VIÊN");
        System.out.printf("%-30s", "TÊN SINH VIÊN");
        System.out.printf("%-15s", "LỚP");
        System.out.printf("%-10s\n", "KHOÁ");
        System.out.println("-------------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d", (i + 1));
            sv[i].inThongTin();
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }

    public static void sapXepTheoTen(SinhVien[] sv, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sv[i].name.compareToIgnoreCase(sv[j].name) > 0) {
                    SinhVien temp;
                    temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
    }

    public static void inDSTheoLop(SinhVien[] sv, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sv[i].Class.compareTo(sv[j].Class) > 0) {
                    SinhVien temp;
                    temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
        System.out.println("************IN THEO LỚP************");
        inDsSinhVien(sv, n);
    }


}
