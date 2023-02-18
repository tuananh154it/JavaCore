package hinhtron;

public class HinhTron {
    private double banKinh;

    public double getBanKinh() {

        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if(isBanKinh(banKinh)){
            this.banKinh = banKinh;
        }
        return;
    }

    public HinhTron(double banKinh) {
        if(isBanKinh(banKinh)){
            this.banKinh = banKinh;
        }
        return;
    }

    public double chuVi(){
        return Math.PI*2*banKinh;
    }
    public double dienTich(){
        return Math.PI*banKinh*banKinh;
    }
    public boolean isBanKinh(double r){
        if(r<0){
            return false;
        }
        return true;
    }
}
