package logic;

import entity.Bank;
import entity.Client;

import java.io.*;
import java.util.Scanner;

public class BankLogic {
    Bank[] banks;

    public BankLogic(Bank[] banks) {
        this.banks = banks;
    }

    // Nhập danh sách ngân hàng
    public void bankInput() {
        System.out.print("Nhập số lượng ngân hàng: ");
        int newBank = 0;
        while (true) {
            try {
                newBank = new Scanner(System.in).nextInt();
                if (newBank < 1) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.print("Nhập không hợp lệ yêu cầu nhập lại: ");
            }
        }

        for (int i = 0; i < newBank; i++) {
            Bank temp = new Bank();
            System.out.println("--- Nhập thông tin cho ngân hàng thứ " + (i + 1) + ": ");
            temp.inputInfor();
            saveBank(temp);
            saveBankToFile(banks);
        }
    }

    private void saveBank(Bank bank) {
        for (int i = 0; i < banks.length; i++) {
            if (banks[i] == null) {
                banks[i] = bank;
                return;
            }
        }
    }

    // mảng ngân hàng vào file
    private void saveBankToFile(Bank[] banks) {
        try {
            FileOutputStream output = new FileOutputStream("D:\\Bank.txt");
            ObjectOutputStream out = new ObjectOutputStream(output);
            out.writeObject(banks);
            out.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // in danh sách ngân hàng
    public void showBank() {
        for (Bank x : banks) {
            if (x != null)
                System.out.println(x);
        }
    }
    // load bank from file
    public void loadBank(){
        try {
            FileInputStream input = new FileInputStream("D:\\Bank.txt");
            ObjectInputStream in = new ObjectInputStream(input);
            banks = (Bank[]) in.readObject();
            in.close();
            input.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
