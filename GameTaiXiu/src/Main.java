import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        XucSac[] xucSacs = new XucSac[3];
        int demVanCuoc = 1;
        int choiTiep = 1;
        do {
            System.out.print("===================");
            System.out.printf("%-16s","VÁN CƯỢC SỐ "+demVanCuoc);
            System.out.println("====================");
            System.out.println("=                                                     =");
            System.out.println("=       TÀI (nhập số 1)    ?    XỈU (nhập số 2)       =");
            System.out.println("=                                                     =");
            System.out.println("=======================================================");
            System.out.print("nhập lựa chọn của bạn(tài nhập 1, xỉu nhập 2): ");
            int luaChon = new Scanner(System.in).nextInt();
            lacXucSac(xucSacs);
            taiHayXiu(xucSacs,luaChon);
            System.out.println(" Bạn có muốn chơi tiếp không ??? (có nhập 1, không nhập 0) : ");
            choiTiep = new Scanner(System.in).nextInt() ;
            demVanCuoc++;
        }while (choiTiep != 0);

    }
    public static void lacXucSac(XucSac[] xucSacs){
        for(int i = 0; i<xucSacs.length;i++){
            xucSacs[i] = new XucSac();
            xucSacs[i].soCham = new  Random().nextInt(6)+1;
        }
    }
    public static void taiHayXiu(XucSac[] xucSacs,int luaChon){
        inXucSac(xucSacs);
        if(xucSacs[0] == xucSacs[1] && xucSacs[0] == xucSacs[2]){
            System.out.println("bộ ba đồng nhất ( bạn THUA )");
            return;
        }
        int sum = xucSacs[0].soCham + xucSacs[1].soCham +xucSacs[2].soCham ;
        int mark = 1;
        if(sum>= 4 && sum<=10){
            System.out.println("số điểm: "+sum+"( XỈU )");
            mark = 2;
            checkKQ(luaChon,mark);
            return;
        }
        System.out.println("số điểm: "+sum+"( TÀI )");
        checkKQ(luaChon,mark);
    }
    public static void checkKQ(int luaChon,int mark){
        if(luaChon == mark){
            System.out.println(" !!!!!!!!!!!!!!!!!!!!!!!!!!!Bạn Thắng !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            return;
        }
        System.out.println(" !!!!!!!!!!!!!!!!!!!!!!!!!!!  Bạn Thua !!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    public static void inXucSac(XucSac[] xucSacs){
        for(int i = 0;i<xucSacs.length;i++){
            xucSacs[i].inXucSac();
        }
    }
}