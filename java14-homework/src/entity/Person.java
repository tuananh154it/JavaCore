package entity;

import java.io.Serializable;
import java.util.Scanner;

public class Person implements Input, Serializable {
    protected String name;
    protected String phoneNumber;
    protected String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Address='" + address + '\'' +
                '}';
    }

    @Override
    public void inputInfor() {
        System.out.print("Nhập tên: ");
        while (true){
            try{
                this.name = new Scanner(System.in).nextLine();
                if(this.name.length() == 0){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập lại tên đúng: ");
            }
        }
        System.out.print("Nhập số điện thoại: ");
        while (true){
            try{
                this.phoneNumber = new Scanner(System.in).nextLine();
                if(!this.phoneNumber.matches("0[^0]\\d{8}")){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập số điện thoại đúng: ");
            }
        }
        System.out.print("Nhập địa chỉ:  ");
        while (true){
            try{
                this.address = new Scanner(System.in).nextLine();
                if(this.address.length() == 0){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập lại tên đúng: ");
            }
        }

    }
}
