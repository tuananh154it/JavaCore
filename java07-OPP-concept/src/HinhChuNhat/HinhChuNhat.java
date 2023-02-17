package HinhChuNhat;

public class HinhChuNhat {
    float chieuDai;
    float chieuRong;
    public HinhChuNhat(float chieuDai, float chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public float chuVi(){
        return 2*(chieuRong+chieuDai);
    }
    public  float dienTich(){
        return chieuDai*chieuRong;
    }
}
