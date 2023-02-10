package HomeWord;

public class bai2 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 10000000; i++) {
            if (KtSNT(i) && ChuSoLaSNT(i) && NghichDaoLaSNT(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean KtSNT(int n) {
        if (n <= 1) {
            return false;
        }
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean ChuSoLaSNT(int n) {
        while (n != 0) {
            int du = n % 10;
            if ((du != 2) && (du != 3) && (du != 5) && (du != 7)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean NghichDaoLaSNT(int n) {
        int nNghich = 0;
        while (n != 0) {
            nNghich = nNghich * 10 + n % 10;
            n /= 10;
        }
        if (KtSNT(nNghich)) {
            return true;
        }
        return false;
    }
}

//    Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
//        a) Là số nguyên tố.
//        b) Tất cả các chữ số là nguyên tố
//        c) Đảo của nó cũng là một số nguyên tố