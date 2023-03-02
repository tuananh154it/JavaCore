package entity;

import java.util.Scanner;

public class DichVu implements Input {
    private static int AUTO_ID = 100;
    private int maDichVu;
    private String tenDichVu;
    private double giaCuoc;
    private String donViTinh;

    public DichVu() {
        this.maDichVu = AUTO_ID;
        AUTO_ID++;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getGiaCuoc() {
        return giaCuoc;
    }

    public void setGiaCuoc(double giaCuoc) {
        this.giaCuoc = giaCuoc;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    @Override
    public String toString() {
        return "DichVu{" +
                "maDichVu=" + maDichVu +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", giaCuoc=" + giaCuoc +
                ", donViTinh='" + donViTinh + '\'' +
                '}';
    }

    @Override
    public void inputInfor() {
        System.out.print("Nhập tên dịch vụ: ");
        this.tenDichVu = new Scanner(System.in).nextLine();
        System.out.print("Nhập giá cước: ");
        while (true) {
            try {
                this.giaCuoc = new Scanner(System.in).nextDouble();
                if (this.giaCuoc < 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("nhập không hợp lệ, yêu cầu nhập lại: ");
            }
        }
        System.out.print("Nhập đơn vị tính: ");
        this.donViTinh = new Scanner(System.in).nextLine();
    }
}
