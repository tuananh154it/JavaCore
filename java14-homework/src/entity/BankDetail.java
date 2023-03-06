package entity;

import java.util.Arrays;
import java.util.Scanner;

public class BankDetail {
    private Bank bank;
    private SavingDetail[] savingDetails;

//    public void inputInfor(){
//        System.out.print("nhập tên ngân hàng cần lập sổ: ");
//        int bankId;
//        while (true){
//            try{
//                bankId = new Scanner(System.in).nextInt();
//                if(if){
//                    throw new Exception();
//                }
//                break;
//            }catch (Exception e){
//                System.out.print("Nhập sai, yêu cầu nhập lại: ");
//            }
//        }
//        int numberOfSaving ;
//        while (true)
//    }
//    private boolean checkBankId()
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
