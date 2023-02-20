package objects;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    public void input(){
        System.out.print("Nhập vào tên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập vào địa chỉ: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.print("Nhập vào số điện thoại: ");
        this.phoneNumber = new Scanner(System.in).nextLine();
    }
    public void print(){
        System.out.printf("%-30s",name);
        System.out.printf("%-30s",address);
        System.out.printf("%-20s",phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
