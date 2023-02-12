package HomeWord;

public class bai13 {
    public static void main(String[] args) {
        for (int i = 100000; i < 1000000; i++) {
            if (ThuanNghichvaChiaHet10(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean ThuanNghichvaChiaHet10(int x) {
        int xCopy = x;
        int y = 0;
        int sum = 0;
        while (xCopy != 0) {
            y = y * 10 + xCopy % 10;
            sum += xCopy % 10;
            xCopy /= 10;
        }
        if ((x == y) && (sum % 10 == 0)) {
            return true;
        }
        return false;
    }

}
//    Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10 (ví dụ số: 721127).