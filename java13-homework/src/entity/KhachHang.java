package entity;

import constant.LoaiKhachHang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KhachHang implements Input {
    private static int AUTO_ID = 10000;
    private int maKhachHang;
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private LoaiKhachHang loaiKhachHang;

    public KhachHang() {
        this.maKhachHang = AUTO_ID;
        AUTO_ID++;
    }
    // input


    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public LoaiKhachHang getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKhachHang=" + maKhachHang +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    @Override
    public void inputInfor() {
        System.out.print("Nhập vào tên: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhập vào Địa chỉ: ");
        this.diaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhập vào SĐT: ");
        this.soDienThoai = new Scanner(System.in).nextLine();
        System.out.println("Lựa chọn loại khách hàng: \n1.Cá nhân\n2.Đại diện đơn vị hành chính\n3.Đại diện đơn vị kinh doanh");
        int luaChon;
        while (true) {
            try {
                luaChon = new Scanner(System.in).nextInt();
                if (luaChon < 1 || luaChon > 3) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Nhập Không hợp lệ yêu cầu nhập lại: ");
            }
        }
        switch (luaChon) {
            case 1:
                this.loaiKhachHang = LoaiKhachHang.CN;
                break;
            case 2:
                this.loaiKhachHang = LoaiKhachHang.DDDVHC;
                break;
            case 3:
                this.loaiKhachHang = LoaiKhachHang.DDDVKD;
                break;
        }
    }
}
