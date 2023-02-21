import entity.*;
import logic_library.Check;
import logic_library.Input;

public class Main {
    static Driver[] drivers = new Driver[0];
    static Route[] routes = new Route[0];
    static Assignment[] assignments = new Assignment[0];
    static TotalDistance[] totalDistances;
    public static void main(String[] args) {
        fn();
    }

    public static void fn() {
        do {
            printMenu();
            int choose = Input.inputIntegerNumber("Nhập chức năng: ",1,10);
            switch (choose){
                case 1:
                    inputNewDrivers();
                    printDriverList();
                    break;
                case 2:
                    inputNewRoute();
                    printRouteList();
                    break;
                case 3:
                    inputAssignment();
                    printAssignmentList();
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    sortByNumberOfRoute();
                    break;
                case 6:
                    creatTableDistance();
                    printTableDistance();
                    break;
                case 7:
                    printDriverList();
                    break;
                case 8:
                    printRouteList();
                    break;
                case 9:
                    printAssignmentList();
                    break;
                case 10:
                    System.out.println("Đã thoát chương trình");
                    return;
            }
        }while (true);
    }
    public static void printMenu(){
        System.out.println("==================== CHƯƠNG TRÌNH QUẢN LÝ LÁI XE BUS =====================\n");
        System.out.println("1. Nhập danh sách Lái xe mới. In ra danh sách lái xe sau khi nhập.");
        System.out.println("2. Nhập danh sách Tuyến mới. In ra danh sách các tuyến sau khi nhập.");
        System.out.println("3. Nhập danh sách phân công cho mỗi lái xe và in danh sách ra màn hình.");
        System.out.println("4. Sắp xếp danh sách phân công theo họ tên lái xe.");
        System.out.println("5. Sắp xếp danh sách phân công theo số tuyến đảm nhận.");
        System.out.println("6. Lập bảng kê tổng khoảng cách chạy xe trong ngày của mỗi lái xe.");
        System.out.println("7. In danh sách lái xe.");
        System.out.println("8. In danh sách tuyến đường");
        System.out.println("9. In danh sách phân công lái xe");
        System.out.println("10. Thoát chương trình.");
    }
    // nhập danh sách lái xe mới.
    public static void inputNewDrivers(){
        int numberOfNewDriver = Input.inputIntegerNumber("Nhập số lượng lái xe mới cần thêm: ",1);
        drivers = Input.overrideDriverArray(drivers,numberOfNewDriver);
        assignments = Input.overrideAssignmentArray(assignments,numberOfNewDriver);
        int numberOfDriver = drivers.length;
        for(int i = numberOfDriver - numberOfNewDriver ;i<numberOfDriver;i++){
            System.out.println("nhập thông tin cho lái xe thứ "+ (i+1));
            drivers[i] = new Driver();
            drivers[i].inputInfo();
            assignments[i] = new Assignment();
            assignments[i].setDriver(drivers[i]);
        }
    }
    // in danh sách lái xe;
    public static void printDriverList(){
        if(drivers.length == 0){
            System.out.println("Chưa có lái xe nào, cần tuyển thêm lái xe !!!");
            return;
        }
        System.out.println("================ DANH SÁCH LÁI XE HIỆN CÓ ==================");
        for(int i = 0; i< drivers.length ; i++){
            System.out.println(drivers[i]);
        }
    }
    // Nhập danh sách tuyến đường mới
    public static void inputNewRoute(){
        int numberOfNewRoute = Input.inputIntegerNumber("Nhập số lượng tuyến đường mới cần thêm: ",1);
        routes = Input.overrideRouteArray(routes,numberOfNewRoute);
        int numberOfRoute = routes.length;
        for(int i = numberOfRoute - numberOfNewRoute ;i<numberOfRoute;i++){
            System.out.println("nhập thông tin cho tuyến đường thứ "+ (i+1));
            routes[i] = new Route();
            routes[i].inputInfo();
        }
    }
    // in danh sách tuyến đường đang có
    public static void printRouteList(){
        if(routes.length == 0){
            System.out.println("Chưa có tuyến đường nào. vui lòng nhập thêm tuyến đường");
            return;
        }
        System.out.println("===================== DANH SÁCH TUYẾN ĐƯỜNG HIỆN ĐANG CHẠY =====================");
        for(int i = 0; i< routes.length;i++){
            System.out.println(routes[i]);
        }
    }
    // nhập phân công cho lái xe
    public static void inputAssignment(){
        if(drivers.length == 0){
            System.out.println("Chưa có lái xe để phân công, vui lòng tuyển thêm !!!");
            return;
        }
        int numberOfNewAssignment = Input.inputIntegerNumber("Nhập số lượng lái xe cần phân công ",1, drivers.length );
        for(int i = 0; i < numberOfNewAssignment; i++){
            int driverCode = Input.inputIntegerNumber("Nhập mã lái xe cần phân công: ",10000,9999 + drivers.length);
            int index = Check.findIndexByDriverCode(assignments,driverCode); // index của tài xế trong bảng quản lý
            DetailedRoute[] temp;
            do {
                int numberOfRoute = Input.inputIntegerNumber("Nhập số tuyến đường chạy trong ngày: ",0,routes.length);
                temp = new DetailedRoute[numberOfRoute];
                int sum = 0 ;
                for (int j = 0; j < numberOfRoute; j++) {
                    int routeCode = Input.inputIntegerNumber("Nhập mã tuyến thứ "+(i+1)+": ",100,99+routes.length);
                    int numberOfDriving = Input.inputIntegerNumber("Nhập số lượt đi trên tuyến " + routeCode +": ",1,15);
                    sum+= numberOfDriving;
                    int indexRoute = Check.findIndexByRouteCode(routes,routeCode);
                    temp[i] = new DetailedRoute(routes[indexRoute],numberOfDriving);
                }
                if(Check.checkIntegerNumber(sum,0,15)){
                    break;
                }
                System.out.println("quá 15 lượt trong một ngày, vui lòng nhập lại từ đầu !!!");
            }while (true);

            assignments[index].setDetailedRoutes(temp);
        }
    }
    //in ra danh sách phân công lái xe
    public static void printAssignmentList(){
        System.out.println("==================== DANH SÁCH PHÂN CÔNG LÁI XE ===================");
        for(int i = 0; i<assignments.length;i++){
            System.out.println(assignments[i]);
        }
    }

    // sắp sếp danh sách quản lý theo tên
    public static void sortByName(){
        for(int i = 0; i< assignments.length-1;i++){
            for (int j = i+1; j < assignments.length; j++) {
                if(assignments[i].getDriver().getFullName().compareToIgnoreCase(assignments[i].getDriver().getFullName()) > 0){
                    Assignment temp = assignments[i];
                    assignments[i] = assignments[j];
                    assignments[j] =temp;
                }
            }
        }
    }
    // sắp sếp danh sách quản số lượng tuyến giảm dần
    public static void sortByNumberOfRoute(){
        for(int i = 0; i< assignments.length-1;i++){
            for (int j = i+1; j < assignments.length; j++) {
                if(assignments[i].getDetailedRoutes().length < assignments[i].getDetailedRoutes().length){
                    Assignment temp = assignments[i];
                    assignments[i] = assignments[j];
                    assignments[j] =temp;
                }
            }
        }
    }
    // lập bảng kê khoảng cách của các lái xe trong ngày
    public static void creatTableDistance(){
        totalDistances = new TotalDistance[drivers.length];
        for(int i = 0 ;i < totalDistances.length;i++){
            totalDistances[i] = new TotalDistance(assignments[i].getDriver(),assignments[i].getTotalDistance());
        }
    }
    // in ra bảng kê khoảng cách
    public static void printTableDistance(){
        System.out.println("================== BẢNG KÊ KHOÀNG CÁCH CỦA CÁC TÀI XẾ TRONG NGÀY ==================");
        for (int i = 0; i < totalDistances.length; i++) {
            System.out.println(totalDistances[i]);
        }
    }
}