package entity;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PostType implements Inputable{
    protected int id;
    protected static int AUTO_ID=100;
    protected String name;
    protected double cost;
    public PostType(){
        this.id = AUTO_ID;
        AUTO_ID++;
    }
    public void inputInfor(){
        System.out.print("nhập tên bài viết: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.print("Nhập giá tiền: ");
        this.cost = new Scanner(System.in).nextDouble();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "PostType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
