import entity.DichVu;
import entity.HoaDon;
import entity.Input;
import entity.KhachHang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static KhachHang[] khachHangs = new KhachHang[1000];
    static DichVu[] dichVus = new DichVu[1000];
    static HoaDon[] hoaDons = new HoaDon[1000];
    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        while (true){
            showMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            int luaChon;
            while (true){
                try{
                    luaChon = new Scanner(System.in).nextInt();
                    if(luaChon<1 || luaChon>9){
                        throw new Exception();
                    }
                    break;
                } catch (Exception e){
                    System.out.print("Nhập không hợp lệ, yêu cầu nhập lại: ");
                }
            }
            switch (luaChon){
                case 1:
                    nhapKhachHang();
                    break;
                case 2:
                    inDanhSachKhachHang();
                    break;
                case 3:
                    nhapDichVu();
                    break;
                case 4:
                    inDanhSachDichVu();
                    break;
                case 5:
                    nhapHoaDon();
                    break;
                case 6:
                    inDanhSachHoaDon();
                    break;
                case 7:
                    sapXepHoaDon();
                    break;
                case 8:
                    lapBangTinhTien();
                    break;
                case 9:
                    System.out.println("đã thoát chương trình !!!");
                    return;
            }
        }
    }

    private static void showMenu() {
        System.out.println("--------------- MENU ---------------");
        System.out.println("1.Nhập danh sách khách hàng");
        System.out.println("2.In danh sách khách hàng");
        System.out.println("3.Nhập danh sách dịch vụ");
        System.out.println("4.In danh sách dịch vụ");
        System.out.println("5.Nhập hoá đơn cho khách hàng đã có");
        System.out.println("6.In danh sách hoá đơn");
        System.out.println("7.Sắp xếp danh sách hoá đơn"); //  theo tên , theo số dịch vụ sử dụng giảm dần
        System.out.println("8.Lập bảng kê số tiền phải trả cho mỗi khác hàng");
        System.out.println("9.Thoát chương trình");
    }
    // nhập danh sách khác hàng
    private static void nhapKhachHang(){
        System.out.print("Nhập số lượng khách cần thêm mới: ");
        int soKhachHang;
        while (true){
            try {
                soKhachHang = new Scanner(System.in).nextInt();
                if (soKhachHang < 0){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập lại: ");
            }
        }
        KhachHang temp;
        for (int i = 0; i < soKhachHang; i++) {
            System.out.println("------ Nhập khách hàng thứ "+(i+1)+(" --------"));
            temp = new KhachHang();
            temp.inputInfor();
            luuMotKhachHang(temp);
        }
    }
    // luu khach hang
    private static void luuMotKhachHang(KhachHang khachHang){
        for(int i = 0; i<khachHangs.length;i++){
            if(khachHangs[i] == null){
                khachHangs[i] = khachHang;
                break;
            }
        }
    }
    // in danh sách khách hàng
    private static void inDanhSachKhachHang(){
        System.out.println("------------ Danh sách khách hàng ----------------");
        for (int i = 0; i < khachHangs.length; i++) {
            if(khachHangs[i] != null){
                System.out.println(khachHangs[i]);
            }
        }
    }
    // nhập danh sách Dịch vụ
    private static void nhapDichVu(){
        System.out.print("Nhập số lượng dịch vụ cần thêm mới: ");
        int soDichVu;
        while (true){
            try {
                soDichVu = new Scanner(System.in).nextInt();
                if (soDichVu < 0){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập lại: ");
            }
        }
        DichVu temp;
        for (int i = 0; i < soDichVu; i++) {
            System.out.println("------ Nhập dịch vụ thứ "+(i+1)+(" --------"));
            temp = new DichVu();
            temp.inputInfor();
            luuMotDichVu(temp);
        }
    }
    //lưu một dịch vụ
    private static void luuMotDichVu(DichVu dichVu){
        for(int i = 0; i<dichVus.length;i++){
            if(dichVus[i] == null){
                dichVus[i] = dichVu;
                break;
            }
        }
    }
    // in danh sách dịch vụ đang có
    private static void inDanhSachDichVu(){
        System.out.println("------------ Danh sách dịch vụ ----------------");
        for (int i = 0; i < dichVus.length; i++) {
            if(dichVus[i] != null){
                System.out.println(dichVus[i]);
            }
        }
    }
    // nhập hoá đơn
    private static void nhapHoaDon(){
        System.out.print("Nhập số lượng hoá đơn cần thêm mới: ");
        int soHoaDon;
        while (true){
            try {
                soHoaDon = new Scanner(System.in).nextInt();
                if (soHoaDon < 0){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập lại: ");
            }
        }
        HoaDon temp;
        for (int i = 0; i < soHoaDon; i++) {
            System.out.println("------ Nhập hoá đơn thứ "+(i+1)+(" --------"));
            temp = new HoaDon();
            temp.inputInfor(khachHangs,dichVus);
            luuMotHoaDon(temp);
        }
    }
    // lưu hoá đơn
    private static void luuMotHoaDon(HoaDon hoaDon){
        for(int i = 0; i<hoaDons.length;i++){
            if(hoaDons[i] == null){
                hoaDons[i] = hoaDon;
                break;
            }
        }
    }
    // in danh sách hoá đơn
    private static void inDanhSachHoaDon(){
        System.out.println("------------ Danh sách hoa đơn ----------------");
        for (int i = 0; i < hoaDons.length; i++) {
            if(hoaDons[i] != null){
                System.out.println(hoaDons[i]);
            }
        }
    }
    // sắp xếp hoá đơn
    private static void sapXepHoaDon(){
        System.out.println("----- Bạn muốn sắp xếp hoá đơn theo ? ---------");
        System.out.println("1.Tên khách hàng");
        System.out.println("2.Số lượng lượng sử dụng dịch vụ");
        System.out.print("Nhập lựa chọn của bạn");
        int luaChon;
        while (true){
            try{
                luaChon = new Scanner(System.in).nextInt();
                if(luaChon <1 || luaChon>2){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập không hợp lệ, yêu cầu nhập lại: ");
            }
        }
        switch (luaChon){
            case 1:
                sapXepTheoTen();
                break;
            case 2:
                sapXepTheoSoLuongSuDung();
                break;
        }

    }
    private static void sapXepTheoTen(){
        for(int i = 0 ; i < hoaDons.length-1;i++){
            for (int j = i+1; j < hoaDons.length; j++) {
                if(hoaDons[j] != null && hoaDons[i].getKhachHang().getHoTen().compareToIgnoreCase(hoaDons[i].getKhachHang().getHoTen()) > 0){
                    HoaDon temp = hoaDons[i];
                    hoaDons[i] = hoaDons[j];
                    hoaDons[j] = temp;
                }
            }
        }
    }
    private static void sapXepTheoSoLuongSuDung(){
        for(int i = 0 ; i < hoaDons.length-1;i++){
            for (int j = i+1; j < hoaDons.length; j++) {
                if(hoaDons[j] != null && hoaDons[i].tongSoLanSuDung() < hoaDons[i].tongSoLanSuDung()){
                    HoaDon temp = hoaDons[i];
                    hoaDons[i] = hoaDons[j];
                    hoaDons[j] = temp;
                }
            }
        }
    }
    // lập bảng tính tiền
    private static void lapBangTinhTien(){
        System.out.println(" - -- - -- -  Bảng tiền phải trả của mỗi khách - -- - --  -- - - ");
        for (int i = 0; i < hoaDons.length; i++) {
            if(hoaDons[i] != null){
                System.out.print(hoaDons[i].getKhachHang().getHoTen()+ " : ");
                System.out.println(hoaDons[i].soTienPhaiTra());
            }
        }
    }
}
