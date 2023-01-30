public class bai4 {
    public static void main(String[] args) {
        double n = 5.68 ;
        double nCan = Math.ceil(Math.sqrt(n) * 1000) / 1000;
        System.out.println("Can bac hai cua " + n + " la: " + nCan);
    }
}
//Bài 4: Khai căn một số dương bất kì, kết quả làm tròn tới 3 chữ số thập phân.