package entity;

import java.util.Scanner;

public class SavingDetail {
    private String book;
    private double money;
    public void inputInfor(){
        System.out.print("Nhập tên sổ tiết kiệm: ");
        while (true){
            try{
                this.book = new Scanner(System.in).nextLine();
                if(this.book.length() == 0){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập lại: ");
            }
        }
        System.out.print("nhập số tiền tiết kiệm: ");
        while (true){
            try{
                this.money = new Scanner(System.in).nextDouble();
                if(this.money <  0){
                    throw new Exception();
                }
                break;
            }catch (Exception e){
                System.out.print("Nhập sai, yêu cầu nhập lại: ");
            }
        }
    }

    @Override
    public String toString() {
        return "SavingDetail{" +
                "book='" + book + '\'' +
                ", money=" + money +
                '}';
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
