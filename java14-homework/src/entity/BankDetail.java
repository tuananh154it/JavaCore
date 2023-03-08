package entity;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDetail {
    private Bank[] banks = new Bank[0];
    private Bank bank;
    private SavingDetail[] savingDetails;
    public double sum(){
        double sum = 0;
        for(int i = 0; i<savingDetails.length;i++){
            sum+= savingDetails[i] .getMoney();
        }
        return sum;
    }
    private void loadBank(){
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

    public void inputInfor(){
        System.out.print("nhập id ngân hàng cần lập sổ: ");
        int bankId;
        while (true){
            try{
                bankId = new Scanner(System.in).nextInt();
                if(checkBankId(bankId) == -1){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập lại: ");
            }
        }
        this.bank = banks[checkBankId(bankId)];
        int numberOfSaving ;
        System.out.print("Nhập số lượng sổ tiết kiệm: ");
        while (true){
            try{
                numberOfSaving = new Scanner(System.in).nextInt();
                if(numberOfSaving<1 || numberOfSaving>5){
                    throw new InputMismatchException();
                }
                break;
            }catch (InputMismatchException e){
                System.out.print("Nhập số lượng lớn hơn 0 và <=5 : ");
            }catch (Exception e){
                System.out.print("Nhập sai yêu cầu nhập lại: ");
            }
        }
        savingDetails = new SavingDetail[numberOfSaving];
        for(int i = 0;i<numberOfSaving;i++){
            System.out.println("-------- Nhập thông tin cho sổ thứ "+(i+1)+" ---------");
            savingDetails[i] = new SavingDetail();
            savingDetails[i].inputInfor();
        }
    }
    private int checkBankId(int bankID){
        loadBank();
        for(int i = 0; i<banks.length;i++){
            if(banks[i] != null && banks[i].getBankId() == bankID){
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return "BankDetail{" +
                "bank=" + bank +
                ", savingDetails=" + Arrays.toString(savingDetails) +
                '}';
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public SavingDetail[] getSavingDetails() {
        return savingDetails;
    }

    public void setSavingDetails(SavingDetail[] savingDetails) {
        this.savingDetails = savingDetails;
    }
}
