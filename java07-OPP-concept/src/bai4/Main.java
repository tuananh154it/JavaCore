package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Số lượng Point cần nhập: ");
        int n = new Scanner(System.in).nextInt();
        MyPoint[] points = new MyPoint[n];
        nhapPoint(points, n);
        tim2DiemXaNhat(points, n);
    }

    public static void nhapPoint(MyPoint[] points, int n) {
        for (int i = 0; i < n; i++) {
            points[i] = new MyPoint();
            System.out.println("Nhập Point thứ " + (i + 1));
            System.out.print("Nhập x: ");
            points[i].x = new Scanner(System.in).nextDouble();
            System.out.print("Nhập y: ");
            points[i].y = new Scanner(System.in).nextDouble();
        }
    }

    public static void tim2DiemXaNhat(MyPoint[] points, int n) {
        double max = -1;
        MyPoint temp1 = new MyPoint();
        MyPoint temp2 = new MyPoint();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double d = MyPoint.distance(points[i], points[j]);
                if (max <= d) {
                    max = d;
                    temp1 = points[i];
                    temp2 = points[j];
                }
            }
        }
        System.out.println("Hai điểm xa nhất là: " + temp1 + " và " + temp2);
        System.out.println("Khoảng cách: " + max);
    }
}
