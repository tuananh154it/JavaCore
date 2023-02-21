package logic_library;

import entity.Assignment;
import entity.Driver;
import entity.Route;

import java.util.Scanner;
public class Input {
    // nhập vào một số nguyên có điều kiện
    public static int inputIntegerNumber(String message, int left, int right){

        do {
            System.out.print(message);
            int number = new Scanner(System.in).nextInt();
            if(Check.checkIntegerNumber(number,left,right)){
                return number;
            }
            System.out.println("Không hợp lệ, yêu cầu nhập lại !!!");
        }while(true);
    }
    public static int inputIntegerNumber(String message, int left){

        do {
            System.out.print(message);
            int number = new Scanner(System.in).nextInt();
            if(Check.checkIntegerNumber(number,left)){
                return number;
            }
            System.out.println("Không hợp lệ, yêu cầu nhập lại !!!");
        }while(true);
    }
    // nhập vào số thực có điều kiện
    public static double inputDoubleNumber(String message, double left){

        do {
            System.out.print(message);
            double number = new Scanner(System.in).nextInt();
            if(Check.checkDoubleNumber(number, left)){
                return number;
            }
            System.out.println("Không hợp lệ, yêu cầu nhập lại !!!");
        }while(true);
    }

    // hàm ghi đè cộng dồn phần tử mới lên mảng Driver cũ
    public static Driver[] overrideDriverArray(Driver[] drivers,int add){
        int numOfOldDrivers = drivers.length;
        Driver[] newDrivers = new Driver[numOfOldDrivers+add];
        for(int i = 0; i< numOfOldDrivers;i++){
            newDrivers[i] = new Driver();
            newDrivers[i] = drivers[i];
        }
        return newDrivers ;
    }
    // mảng ghi đè cộng dồn lên mảng Route cũ
    public static Route[] overrideRouteArray(Route[] routes, int add){
        int numOfOldRoutes = routes.length;
        Route[] newRoute = new Route[numOfOldRoutes+add];
        for(int i = 0; i< numOfOldRoutes;i++){
            newRoute[i] = new Route();
            newRoute[i] = routes[i];
        }
        return newRoute ;
    }
    // mảng ghi đè cộng dồn lên mảng Assignment cũ
    public static Assignment[] overrideAssignmentArray(Assignment[] assignments, int add){
        int numOfOldAssignment = assignments.length;
        Assignment[] newAssignment = new Assignment[numOfOldAssignment+add];
        for(int i = 0; i< numOfOldAssignment;i++){
            newAssignment[i] = new Assignment();
            newAssignment[i] = assignments[i];
        }
        return newAssignment ;
    }

}
