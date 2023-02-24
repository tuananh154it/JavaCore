package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class SalesAgent extends Person{
    private static int AUTO_STAFF_CODE = 1000;
    private int staffCode;
    private String contractSigningDate;
    public SalesAgent(){
        this.staffCode = AUTO_STAFF_CODE;
        AUTO_STAFF_CODE++;
    }
    public void inputInfor(){
        super.inputInfor();
        System.out.print("Nhập ngày ký hợp đồng: ");
        this.contractSigningDate = new Scanner(System.in).nextLine();
    }
    public int getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(int staffCode) {
        this.staffCode = staffCode;
    }

    public String getContractSigningDate() {
        return contractSigningDate;
    }

    public void setContractSigningDate(String contractSigningDate) {
        this.contractSigningDate = contractSigningDate;
    }

    @Override
    public String toString() {
        return "SalesAgent{" +
                "staffCode=" + staffCode +
                ", contractSigningDate='" + contractSigningDate + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
