package abstraction;
// lop ao dung asbtract
public abstract class DongVat {
    private int id;
    private String name;
    public abstract void eat();
    public abstract void move();
    public void demo(){
        System.out.println("demo");
    }
    // lớp ảo chứa nhiều hàm ảo. hàm ảo không có thân
}
