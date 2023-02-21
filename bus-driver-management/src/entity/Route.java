package entity;

import logic_library.Input;

import java.util.Scanner;

public class Route {
    private static int AUTO_ROUTE_CODE = 100;
    private int routeCode;
    private double distance;
    private int numberOfStops;
    // nhập thông tin tuyến đường mới
    public void inputInfo(){
        this.distance = Input.inputDoubleNumber("Nhập khoảng cách: ",0);
        this.numberOfStops = Input.inputIntegerNumber("Nhập số điểm dừng: ", 1);
    }
    public Route(){
        this.routeCode = AUTO_ROUTE_CODE;
        AUTO_ROUTE_CODE++;
    }

    public int getRouteCode() {
        return routeCode;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(int numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeCode=" + routeCode +
                ", distance=" + distance +
                ", numberOfStops=" + numberOfStops +
                '}';
    }
}
