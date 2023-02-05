import java.util.Scanner;

public class tinPi {
    public static void main(String[] args) {
        System.out.print("nhap c cang nho cang tot :");
        double c = new Scanner(System.in).nextDouble();
        double PI = 0;
        int n = 0;
        while (true){
            if(c<(double)1/(2*n+1)){
                break;
            }
            if(n%2 ==0){
                PI+= (double)Math.pow(-1,n)/(2*n+1);
            }
            n++;
        }
        PI*=4;
        System.out.println("so PI la: "+ PI);
    }
}
