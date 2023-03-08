package logic;

import entity.Bank;
import entity.Client;
import entity.Saving;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SavingLogic {
    Client[] clients;
    Bank[] banks;
    Saving[] savings;
    public SavingLogic(Client[] clients, Bank[] banks , Saving[] savings) {
        this.banks = banks;
        this.clients = clients;
        this.savings = savings;
    }
    // Nhập danh sách sổ tiết kiệm
    public void savingInput() {
        System.out.print("Nhập số lượng khách hàng cần mở sổ: ");
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
            Saving temp = new Saving();
            System.out.println("--- Nhập thông tin sổ cho khách hàng thứ " + (i + 1) + ": ");
            temp.inputInfor();
            saveSaving(temp);
        }
        saveSavingToFile(savings);
    }

    private void saveSaving(Saving saving) {
        for (int i = 0; i < savings.length; i++) {
            if (savings[i] == null) {
                savings[i] = saving;
                return;
            }
        }
    }

    // lưu sổ tk hàng vào file
    private void saveSavingToFile(Saving[] savings) {
        try {
            FileOutputStream output = new FileOutputStream("D:\\Saving.txt");
            ObjectOutputStream out = new ObjectOutputStream(output);
            out.writeObject(savings);
            out.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // in danh sách sổ
    public void showSaving() {
        for (Saving x : savings) {
            if (x != null)
                System.out.println(x);
        }
    }
    // load
    public void loadSaving(){
        try {
            FileInputStream input = new FileInputStream("D:\\Saving.txt");
            ObjectInputStream in = new ObjectInputStream(input);
            savings = (Saving[]) in.readObject();
            in.close();
            input.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    // sắp xếp
    public void sort(){
        System.out.println("Sắp xếp theo: ");
        System.out.println("1.Tên khách hàng");
        System.out.println("2.Tổng số tiền gửi");
        int choose;
        while (true){
            try{
                choose = new Scanner(System.in).nextInt();
                if(choose != 1 || choose != 2){
                    throw new InputMismatchException();
                }
                break;
            }catch (InputMismatchException e){
                System.out.print("lựa chọn không hợp lệ, yêu cầu chọn lại:");
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập lại: ");
            }
        }
        if(choose == 1){
            sortByName();
        }else {
            showSaving();
        }
    }
    // sắp xếp theo tên
    private void sortByName(){
        for(int i = 0; i< savings.length-1; i++){
            for(int j = i+1; j<savings.length;j++){
                if(savings[i]!=null && savings[j]!=null && savings[i].getClient().getName().compareToIgnoreCase(savings[j].getClient().getName())>0){
                    Saving temp = savings[i];
                    savings[i] = savings[j];
                    savings[j] = temp;
                }
            }
        }
    }
    private void sortMoney(){
        for(int i = 0; i< savings.length-1; i++){
            for(int j = i+1; j<savings.length;j++){
                if(savings[i].sumMoney()>savings[j].sumMoney()){
                    Saving temp = savings[i];
                    savings[i] = savings[j];
                    savings[j] = temp;
                }
            }
        }
    }
    public void money(){
        for (int i = 0; i < savings.length; i++) {
            System.out.println(savings[i].getClient().getName()+": "+savings[i].sumMoney());
        }
    }

}
