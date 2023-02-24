package logic;

import entity.InputValue;
import entity.Item;
import entity.SalesAgent;
import entity.SalesList;

public class SaleListLogic {
    SalesList[] salesLists;
    //
    SalesAgent[] salesAgents;
    Item[] items;

    public SaleListLogic(SalesList[] salesLists, SalesAgent[] salesAgents, Item[] items) {
        this.salesLists = salesLists;
        this.salesAgents = salesAgents;
        this.items = items;
    }

    public void addnew(){
        int num = InputValue.inputIntegerNumber("Nhập số lượng cần lập bảng: ",1);
        SalesList temp = new SalesList(salesAgents,items);
        for(int i = 1; i< num;i++){
            System.out.println("------------------nhập thông tin bán hàng-------------------- ");
            temp.inputInfor();
            save(temp);
        }
    }
    public void save(SalesList sl){
        for(int i = 0; i< salesLists.length ;i++){
            if(salesLists[i] == null){
                salesLists[i] = new SalesList();
                salesLists[i] = sl;
            }
        }
    }
    public void showList(){
        System.out.println("------------Danh sách lập công -------------------");
        for(int i = 0; i<salesLists.length;i++){
            if(salesLists[i] != null){
                System.out.println(salesAgents[i]);
            }
        }
    }
    // sap xep
    public void sort(){
        System.out.println("sắp xếp theo: \n1. theo tên\n2.theo nhóm");
        int choose = InputValue.inputIntegerNumber("Nhập lựa chọn: ",1,2);
        if(choose == 1){
            sortByName();
        }else {
            ///
        }
    }
    // theo tên
    private void sortByName(){
        for(int i =  0 ; i< salesLists.length; i++){
            for(int j = i + 1;j < salesLists.length-1; i++){
                if(salesLists[i].getSalesAgent().getName().compareToIgnoreCase(salesLists[j].getSalesAgent().getName())>0){
                    SalesList temp = salesLists[i];
                    salesLists[i] = salesLists[j];
                    salesLists[j] = temp;
                }
            }
        }
    }
}
