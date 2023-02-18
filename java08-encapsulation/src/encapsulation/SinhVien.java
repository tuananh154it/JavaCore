package encapsulation;

public class SinhVien {
    private int maSinhVien;
    private String hoVaTen;
    private String gioiTinh;
    private String tenlop;
    private double diemTrungBinh;
    public void setMaSinhVien(int maSinhVien){
        this.maSinhVien = maSinhVien;
    }
    public int getMaSinhVien(){
        return maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getTenlop() {
        return tenlop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
}
