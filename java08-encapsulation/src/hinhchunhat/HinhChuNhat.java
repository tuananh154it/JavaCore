package hinhchunhat;

import hinhtron.HinhTron;

public class HinhChuNhat {
    private double chieuDai;
    private  double chieuRong;
    public HinhChuNhat(){

    }
    public HinhChuNhat(double chieuDai, double chieuRong) {
        if(!isReal(chieuRong) || !isReal(chieuDai)){
            System.out.println("Nhập sai");
            return;
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if(!isReal(chieuDai)){
            return;
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(!isReal(chieuRong)){
            System.out.println("Nhập sai");
           return;
        }
        this.chieuRong = chieuRong;
    }
    private boolean isReal(double x){
        if(x>0){
            System.out.println("Nhập sai");
            return true;
        }
        return false;
    }
    public double chuVi(){
        return 2*(this.chieuDai*this.chieuRong);
    }
    public double dienTich(){
        return this.chieuRong*this.chieuDai;
    }
}
