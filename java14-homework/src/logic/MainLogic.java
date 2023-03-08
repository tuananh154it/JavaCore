package logic;

import entity.Bank;
import entity.Client;
import entity.Saving;

import java.util.Scanner;

public class MainLogic {
    // client
    Client[] clients = new Client[100];
    ClientLogic clientLogic = new ClientLogic(clients);
    // Bank
    Bank[] banks = new Bank[100];
    BankLogic bankLogic = new BankLogic(banks);
    // Saving
    Saving[] savings = new Saving[100];
    SavingLogic savingLogic = new SavingLogic(clients,banks,savings);
    public void menu() {
        // tải dữ liệu từ file lên
        clientLogic.loadClient();
        bankLogic.loadBank();
        savingLogic.loadSaving();
        while (true){
            showMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            int choose = 0;
            while (true){
                try{
                    choose = new Scanner(System.in).nextInt();
                    if(choose<1 || choose>9){
                        throw new Exception();
                    }
                }catch (Exception e){
                    System.out.print("Nhập sai, yêu cầu nhập lại: ");
                }
                break;
            }
            switch (choose){
                case 1:
                    clientLogic.clientInput();
                    break;
                case 2:
                    clientLogic.showClient();
                    break;
                case 3:
                    bankLogic.bankInput();
                    break;
                case 4:
                    bankLogic.showBank();
                    break;
                case 5:
                    savingLogic.savingInput();
                    break;
                case 6:
                    savingLogic.showSaving();
                    break;
                case 7:
                    savingLogic.sort();
                    break;
                case 8:
                    System.out.println("------ Bảng thống kê ------");
                    savingLogic.money();
                    break;
                case 9:
                    System.out.println("Đã thoát chương trình");
                    return;
            }
        }
    }

    private void showMenu() {
        System.out.println("-----------------Menu---------------");
        System.out.println("1.Nhập danh sách khác hàng");
        System.out.println("2.In danh sách khách hàng đã có");
        System.out.println("3.Nhập danh sách ngân hàng");
        System.out.println("4.In danh sách ngân hàng đã có");
        System.out.println("5.Nhập sổ tiết kiệm cho khách hàng đã có");
        System.out.println("6.In danh sách sổ tiết kiệm");
        System.out.println("7.Sắp xếp danh sách sổ tiết kiệm");
        System.out.println("8.Lập bảng thống kê số tiền gửi cho mỗi khách hàng");
        System.out.println("9.Thoát chương trình");
    }
}
