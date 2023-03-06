package logic;

import my_library.Input;

import java.util.Scanner;

public class MenuManagement {
    public void menu(){
        while (true){
            showMenu();
            int choose = Input.inputChoose(1,8);
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    return;
            }
        }
    }
    private void showMenu(){
        System.out.println("+-----------------------Funy Farm-----------------------+");
        System.out.println("|                                                       |");
        System.out.println("|       1. Thống kê tài sản hiện có                     |");
        System.out.println("|       2. Mua giống                                    |");
        System.out.println("|       3. Thu hoạch                                    |");
        System.out.println("|       4. Bán sản phẩm                                 |");
        System.out.println("|       5. Mini game                                    |");
        System.out.println("|       6. Chat với người chơi khác                     |");
        System.out.println("|       7. Xem bảng xếp hạng                            |");
        System.out.println("|       8. Đăng xuất                                    |");
        System.out.println("|                                                       |");
        System.out.println("+-------------------------------------------------------+");
    }



}
