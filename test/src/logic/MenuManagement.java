package logic;

import entity.InputValue;
import entity.Item;
import entity.SalesAgent;
import entity.SalesList;

public class MenuManagement {
    SalesAgent[] salesAgents;
    SalesAgentLogic salesAgentLogic;
    //
    Item[] items;
    ItemLogic itemLogic;
    //
    SalesList[] salesLists;
    SaleListLogic saleListLogic;
    public MenuManagement(){
        this.items = new Item[1000];
        ItemLogic itemLogic  = new ItemLogic(items);
        this.salesAgents = new SalesAgent[1000];
        SalesAgentLogic salesAgentLogic = new SalesAgentLogic(salesAgents);
        this.salesLists = new SalesList[1000];
        SaleListLogic salesList = new SaleListLogic(salesLists,salesAgents,items);
    }

    public void menu(){
        do {
            showMenu();
            int choose = InputValue.inputIntegerNumber("Nhập vào lựa chọn của bạn: ",1,7);
            switch (choose){
                case 1:
                    itemLogic.addnewItems();
                    break;
                case 2:
                    itemLogic.showItemList();
                    break;
                case 3:
                    salesAgentLogic.addnewAgent();
                    break;
                case 4:
                    salesAgentLogic.showAgentList();
                    break;
                case 5:
                    saleListLogic.addnew();
                    saleListLogic.showList();
                    break;
                case 6:
                    saleListLogic.sort();
                    saleListLogic.showList();

                    break;
                case 7:
                    System.out.println("Đã thoát chương trình !!!");
                    return;
            }
        }while (true);
    }
    private void showMenu(){
        System.out.println("==================Menu=================");
        System.out.println("1. Nhập danh sách mặt hàng");
        System.out.println("2. In danh sách mặt hàng");
        System.out.println("3. Nhập danh sách nhân viên bán hàng");
        System.out.println("4. In danh sách nhân viên bán hàng");
        System.out.println("5. lập bảng danh sách bán hàng, in ra");
        System.out.println("6. Sắp xếp bảng danh sách bán hàng");
        System.out.println("7. Thoát chương trình");
    }

}
