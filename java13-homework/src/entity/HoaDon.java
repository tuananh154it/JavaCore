package entity;

import java.util.Arrays;
import java.util.Scanner;

public class HoaDon {
    private KhachHang khachHang;
    private DichVuDetail[] dichVuDetail;
    // tính số tiền phải trả
    public double soTienPhaiTra(){
        double sum = 0;
        for (DichVuDetail x:dichVuDetail) {
            sum+=x.tinhTien();
        }
        return sum;
    }

    public void inputInfor(KhachHang[] khachHangs, DichVu[] dichVus) {
        // nhập mã khách hàng
        System.out.print("Nhập mã khách hàng: ");
        int maKhachHang;
        while (true){
            try {
                maKhachHang = new Scanner(System.in).nextInt();
                if(timKiemMaKhachHang(khachHangs,maKhachHang) == -1){
                    throw new Exception();
                }
                this.khachHang = khachHangs[timKiemMaKhachHang(khachHangs,maKhachHang)];
                break;
            }catch (Exception e){
                System.out.print("Nhập không hợp lệ, vui lòng nhập lại mã khách hàng: ");
            }
        }
        // số lượng dịch vụ
        System.out.print("Nhập số lượng dịch vụ: ");
        int soDichVu;
        while (true){
            try {
                soDichVu = new Scanner(System.in).nextInt();
                if(soDichVu < 0){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập không hợp lệ, vui lòng nhập lại mã khách hàng: ");
            }
        }
        // danh sách dịch vụ
        dichVuDetail = new DichVuDetail[soDichVu];
        for(int i = 0; i< soDichVu;i++){
            System.out.print("nhập mã dịch vụ thứ "+ (i+1)+": ");
            // nhập dịch vụ
            int maDichVu = 0;
            while (true){
                try{
                    maDichVu = new Scanner(System.in).nextInt();
                    if(timKiemMaDichVu(dichVus,maDichVu) == -1){
                        throw new Exception();
                    }
                    break;
                }catch (Exception e){
                    System.out.print("Nhập không hợp lệ, yêu cầu nhập lại: ");
                }
            }

            // số lần sử dung
            System.out.print("Nhập số lần sử dụng dịch vụ: ");
            int solanSuDung = 0;
            while (true){
                try{
                    solanSuDung = new Scanner(System.in).nextInt();
                    if(solanSuDung < 0){
                        throw new Exception();
                    }
                    break;
                }catch (Exception e){
                    System.out.print("Nhập không hợp lệ, yêu cầu nhập lại: ");
                }
            }

            dichVuDetail[i] = new DichVuDetail(dichVus[timKiemMaDichVu(dichVus,maDichVu)],solanSuDung);
        }
    }

    // tìm kiếm mã khách hàng;
    private int timKiemMaKhachHang(KhachHang[] khachHangs, int maKhachHang) {
        for (int i = 0; i < khachHangs.length; i++) {
            if (khachHangs[i] != null && khachHangs[i].getMaKhachHang() == maKhachHang) {
                return i;
            }

        }
        return -1;
    }
    // tìm kiếm mã dịch vụ
    private int timKiemMaDichVu(DichVu[]  dichVus, int maDichVu) {
        for (int i = 0; i < dichVus.length; i++) {
            if (dichVus[i] != null && dichVus[i].getMaDichVu() == maDichVu) {
                return i;
            }
        }
        return -1;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DichVuDetail[] getDichVuDetail() {
        return dichVuDetail;
    }

    public void setDichVuDetail(DichVuDetail[] dichVuDetail) {
        this.dichVuDetail = dichVuDetail;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "khachHang=" + khachHang +
                ", dichVuDetail=" + Arrays.toString(dichVuDetail) +
                '}';
    }
// tính tổng số lần sùng dịch vụ
    public int tongSoLanSuDung(){
        int sum = 0;
        for(DichVuDetail x : dichVuDetail){
            sum+=x.getSoLanSuDung();
        }
        return sum;
    }
    // lập bảng tính tiền
}
