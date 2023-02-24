package logic;

import entity.InputValue;
import entity.Item;

public class ItemLogic {
    Item[] items;
// constructor
    public ItemLogic(Item[] items) {
        this.items = items;
    }


    // nhập sản phẩm mới
    public void addnewItems(){
        int numberOfNewItems = InputValue.inputIntegerNumber("Nhập vào số lượng mặt hàng cần thêm: ",1);
        Item item = new Item();
        for(int i = 1; i<= numberOfNewItems;i++){
            System.out.println("--------Nhập thông tin cho sản phẩm thứ "+i+"-----------");
            item.inputInfor();
            save(item);
        }
    }
    // lưu item mới vào vị trí null
    public void save(Item it){
        for(int i = 0; i< items.length ;i++){
            if(items[i] == null){
                items[i] = new Item();
                items[i] = it;
            }
        }
    }
    public void showItemList(){
        if(items[0] == null){
            System.out.println("Chưa có mặt hàng nào, vui lòng nhập thêm !!!");
            return;
        }
        System.out.println("-------------- Danh sách mặt hàng đang có ----------------");
        for(int i =0; i<items.length;i++){
            if(items[i] != null){
                System.out.println(items[i]);
            }
        }
    }
}
