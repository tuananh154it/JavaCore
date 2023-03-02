package entity;

public class DichVuDetail {
    private DichVu dichVu;
    private int soLanSuDung;

    public DichVuDetail(DichVu dichVu, int soLanSuDung) {
        this.dichVu = dichVu;
        this.soLanSuDung = soLanSuDung;
    }


    public DichVu getDichVu() {
        return dichVu;
    }


    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public int getSoLanSuDung() {
        return soLanSuDung;
    }

    public void setSoLanSuDung(int soLanSuDung) {
        this.soLanSuDung = soLanSuDung;
    }
    public double tinhTien(){
        return this.dichVu.getGiaCuoc()*this.soLanSuDung;
    }

    @Override
    public String toString() {
        return "DichVuDetail{" +
                "dichVu=" + dichVu +
                ", soLanSuDung=" + soLanSuDung +
                '}';
    }

}
