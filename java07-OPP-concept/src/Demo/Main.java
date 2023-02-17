package Demo;

public class Main {
    public static void main(String[] args) {
        HinhTron hinhTron1 = new HinhTron(3.5f);
        System.out.println(hinhTron1.dienTich());
        System.out.println(hinhTron1.chuVi());
        HinhTron hinhTron2 = new HinhTron(10f);
        System.out.println(hinhTron2.chuVi());
        System.out.println(hinhTron2.dienTich());
    }
}
