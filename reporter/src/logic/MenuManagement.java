package logic;

import entity.Reporter;

public class MenuManagement {
    private ReporterLogic reporterLogic;

    public MenuManagement() {
        Reporter[] reporters = new Reporter[1000];
        reporterLogic = new ReporterLogic(reporters);
    }
    public void menu(){
        do {
            printMenu();
            int choose = Input.inputNumber("Nhập vào lựa chọn của bạn: ",1,8);
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    return;
            }
        }while (true);
    }
    public void printMenu(){
        System.out.println("============== MENU ===============");
        System.out.println("1. Nhập danh sách phóng viên.");
        System.out.println("2. In ra danh sách phóng viên đã có");
        System.out.println("3. Nhập danh sách kiểu bài viết");
        System.out.println("4. In ra danh sách kiểu bài đã có");
        System.out.println("5. Lập Bảng tính công cho phóng viên bằng cách nhập các kiểu bài mà \n mỗi phóng viên đã viết cùng số lượng tương ứng và in danh sách ra màn hình.");
        System.out.println("6. Sắp xếp");
        System.out.println("7. Lập bảng kê thu nhập của mỗi phóng viên");
        System.out.println("8. Thoát");
    }

}
