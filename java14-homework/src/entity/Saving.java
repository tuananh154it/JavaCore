package entity;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Saving {
    Client[] clients = new Client[0];
    private Client client;
    private BankDetail[] bankDetails;
    //
    public double sumMoney(){
        double sum = 0;
        for (int i = 0; i < bankDetails.length; i++) {
            sum+= bankDetails[i].sum();
        }
        return sum;
    }
    private void loadClient(){
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
    public void inputInfor(){
        int clientId;
        System.out.print("Nhập vào mã khách hàng cần lập sổ: ");
        while (true){
            try{
                clientId = new Scanner(System.in).nextInt();
                if(checkClientId(clientId) == -1){
                    throw new InputMismatchException();
                }
                break;
            }catch (InputMismatchException e){
                System.out.print("id không tồn tại, vui lòng nhập lại: ");
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhâpj lại: ");
            }
        }
        this.client = clients[checkClientId(clientId)];
        int numberOfBank;
        System.out.print("Nhập số ngân hàng cần lập sổ: ");
        while (true){
            try{
                numberOfBank = new Scanner(System.in).nextInt();
                if(numberOfBank<1){
                    throw new InputMismatchException();
                }
                break;
            }catch (InputMismatchException e){
                System.out.print("Nhập sai, yêu cầu nhập số lượng lớn hơn 0: ");
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập lại: ");
            }
        }
        bankDetails = new BankDetail[numberOfBank];
        for (int i = 0; i < numberOfBank; i++) {
            System.out.println("-----Nhập sổ cho ngân hàng thứ "+(i+1)+"------");
            bankDetails[i] = new BankDetail();
            bankDetails[i].inputInfor();
        }
    }
    private int checkClientId(int id){
        loadClient();

        for(int i = 0; i< clients.length;i++){
            if(clients[i] != null && clients[i].getClientId() == id){
                return i;
            }
        }
        return -1;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public BankDetail[] getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(BankDetail[] bankDetails) {
        this.bankDetails = bankDetails;
    }

    @Override
    public String toString() {
        return "Saving{" +
                "client=" + client +
                ", bankDetails=" + Arrays.toString(bankDetails) +
                '}';
    }
}
