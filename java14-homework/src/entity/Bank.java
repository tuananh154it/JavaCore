package entity;

import java.io.Serializable;
import java.util.Scanner;

public class Bank implements Input, Serializable {
    private static int AUTO_ID = 100;
    private int bankId;
    private String bankName;
    private double interest;
    public Bank(){
        this.bankId = AUTO_ID;
        AUTO_ID++;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public void inputInfor() {
        System.out.print("Nhập tên ngân hàng: ");
        while (true){
            try{
                this.bankName = new Scanner(System.in).nextLine();
                if(this.bankName.length() == 0){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập không hợp lệ, yêu cầu nhập lại: ");
            }
        }
        System.out.print("Nhập lãi xuất: ");
        while (true){
            try{
                this.interest = new Scanner(System.in).nextDouble();
                if(this.bankName.length() == 0){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập không hợp lệ, yêu cầu nhập lại: ");
            }
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                ", interest=" + interest +
                '}';
    }
}
