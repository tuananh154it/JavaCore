package logic_library;

import entity.Assignment;
import entity.Route;

public class Check {
    // kiểm tra số nguyên trong một khoảng

    public static boolean checkIntegerNumber(int x, int left, int right) {
        return x >= left && x <= right;
    }


    public boolean checkIntegerNumber() {
        return false;
    }


    public boolean checkDoubleNumber() {
        return false;
    }

    public static boolean checkIntegerNumber(int x, int left) {
        return (x >= left) ? true : false;
    }

    // kiểm tra số thực trong một khoảng
    public static boolean checkDoubleNumber(double x, double left) {
        return (x >= left) ? true : false;
    }

    public static int findIndexByDriverCode(Assignment[] assignments, int driverCode) {
        for (int i = 0; i < assignments.length; i++) {
            if (assignments[i].getDriver().getDrivingCode() == driverCode) {
                return i;
            }
        }
        return -1;
    }

    public static int findIndexByRouteCode(Route[] routes, int routeCode) {
        for (int i = 0; i < routes.length; i++) {
            if (routes[i].getRouteCode() == routeCode) {
                return i;
            }
        }
        return -1;
    }
}
