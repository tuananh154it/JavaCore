public class viDu6 {
    public static void main(String[] args) {
        for(int i = 10000;i<10000000; i++){
            if(ktSNT(i) && thuanNghich(i) && chuSo4(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean ktSNT(int n) {
        if (n <= 0) {
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
    public static boolean thuanNghich(int n){
        String str = String.valueOf(n);
        int leng = str.length();
        for(int i = 0; i< leng ;i++){
            if(str.charAt(i) != str.charAt(leng-1-i)){
                return false;
            }
        }
        return true;
    }
    public static boolean chuSo4(int n){
        while (n>0){
            int du = n%10;
            if (du == 4){
                return false;
            }
            n/=10;
        }
        return true;
    }
}
