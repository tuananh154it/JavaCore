package bai3;

import HinhChuNhat.HinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle hcn = new Rectangle();
        nhapHinhChuNhat(hcn);
        printAll(hcn);

    }
    public static void nhapHinhChuNhat(Rectangle hcn){
        System.out.print("Nhập chiều dài: ");
        hcn.height = new Scanner(System.in).nextDouble();
        System.out.print("Nhập chiều rộng: ");
        hcn.width = new Scanner(System.in).nextDouble();
        System.out.print("Nhập màu sắc: ");
        hcn.color = new Scanner(System.in).nextLine();
    }
    public static void printAll(Rectangle hcn){
        System.out.println("------ thông tin của hình chữ nhật -------");
        System.out.println("Chiều rộng: "+hcn.getWidth());
        System.out.println("Chiều dài: "+hcn.getHeight());
        System.out.println("Màu sắc: "+hcn.getColor());
        System.out.println("Chu Vi: "+hcn.findPerimeter());
        System.out.println("Diện tích: "+hcn.findArea());
    }
}
