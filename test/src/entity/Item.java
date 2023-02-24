package entity;

import constant.ItemGroup;

import java.util.Scanner;

public class Item implements Input{
    private static int AUTO_ITEM_CODE = 1000;
    private int itemCode;

    private String itemName;

    private ItemGroup itemGroup;
    private double price;
    private int quantity;

    public Item() {
        this.itemCode = AUTO_ITEM_CODE;
        AUTO_ITEM_CODE++;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ItemGroup getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(ItemGroup itemGroup) {
        this.itemGroup = itemGroup;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode=" + itemCode +
                ", itemName='" + itemName + '\'' +
                ", itemGroup=" + itemGroup +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public void inputInfor() {
        System.out.print("Nhập tên sản phẩm: ");
        this.itemName = new Scanner(System.in).nextLine();
        inputItemGroup();
        System.out.print("Nhập đơn giá: ");
        this.price = new Scanner(System.in).nextDouble();
        System.out.print("Nhập số lượng: ");
        this.quantity = new Scanner(System.in).nextInt();
    }
    private void inputItemGroup(){
        int choose;
        System.out.println("Danh sách nhóm hàng:");
        System.out.println("1. Điện tử");
        System.out.println("2. Điện lạnh");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng");
        choose = InputValue.inputIntegerNumber("Nhập lựa chọn: ",1,4);
        switch (choose){
            case 1:
                this.itemGroup = ItemGroup.DT;
                break;
            case 2:
                this.itemGroup = ItemGroup.DL;
                break;
            case 3:
                this.itemGroup = ItemGroup.MT;
                break;
            case 4:
                this.itemGroup = ItemGroup.TBVP;
                break;
        }
    }
}
