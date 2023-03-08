package logic;

import entity.Client;

import java.io.*;
import java.util.Scanner;

public class ClientLogic {
    Client[] clients;

    public ClientLogic(Client[] clients) {
        this.clients = clients;
    }

    // Nhập danh sách khách hàng
    public void clientInput() {
        System.out.print("Nhập số lượng khách hàng cần thêm: ");
        int newClient = 0;
        while (true) {
            try {
                newClient = new Scanner(System.in).nextInt();
                if (newClient < 1) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Nhập không hợp lệ yêu cầu nhập lại: ");
            }
        }

        for (int i = 0; i < newClient; i++) {
            Client temp = new Client();
            System.out.println("--- Nhập thông tin cho khách hàng thứ " + (i + 1) + ": ");
            temp.inputInfor();
            saveClient(temp);
            saveClientToFile(clients);
        }
    }

    private void saveClient(Client client) {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] == null) {
                clients[i] = client;
                return;
            }
        }
    }

    // mảng khách hàng vào file
    private void saveClientToFile(Client[] clients) {
        try {
            FileOutputStream output = new FileOutputStream("D:\\Client.txt");
            ObjectOutputStream out = new ObjectOutputStream(output);
            out.writeObject(clients);
            out.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // in danh sách khách hàng
    public void showClient() {
        for (Client x : clients) {
            if (x != null)
                System.out.println(x);
        }
    }
    // load client from file
    public void loadClient(){
        try {
            FileInputStream input = new FileInputStream("D:\\Client.txt");
            ObjectInputStream in = new ObjectInputStream(input);
            clients = (Client[]) in.readObject();
            in.close();
            input.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
