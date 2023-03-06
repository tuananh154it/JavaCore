import entity.Client;
import entity.Person;

import java.io.*;
import java.util.Scanner;

public class Main implements Serializable{
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
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
                    clientInput();
                    break;
                case 2:
                    showClient();
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
                    break;
                case 9:
                    System.out.println("Đã thoát chương trình");
                    return;
            }
        }
    }

    private static void showMenu() {
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
    // Nhập danh sách khách hàng
    private static void clientInput(){
        System.out.print("Nhập số lượng khách hàng cần thêm: ");
        int newClient= 0;
        while (true){
            try {
                newClient = new Scanner(System.in).nextInt();
                if(newClient < 1){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập không hợp lệ yêu cầu nhập lại: ");
            }
        }
        Client[] clients = new Client[newClient];
        for (int i = 0; i< newClient;i++){
            System.out.println("--- Nhập thông tin cho khách hàng thứ "+(i+1)+": ");
            clients[i] = new Client();
            clients[i].inputInfor();
        }
        saveClient(clients);
    }
    // lưu khách hàng vào tệp
    private static void saveClient(Client[] clients){
        try{
            FileOutputStream output = new FileOutputStream("D:\\Client.txt",true);
            ObjectOutputStream out = new ObjectOutputStream(output);
            out.writeObject(clients);
            out.close();
            output.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void showClient(){
        try{
            FileInputStream input = new FileInputStream("D:\\Client.txt");
            ObjectInputStream in = new ObjectInputStream(input);
            Client[] clients = (Client[])in.readObject();
            in.close();
            input.close();
            for (Client x:clients){
                System.out.println(x);
            }
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
