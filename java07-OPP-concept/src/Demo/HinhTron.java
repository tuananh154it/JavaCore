package Demo;

public class HinhTron {
    float banKinh;
    public HinhTron(float banKinh){
        this.banKinh = banKinh;
    }
    public double dienTich(){
        return Math.PI*banKinh*banKinh;
    }
    public double chuVi(){
        return Math.PI*banKinh*2;
    }
}
