package entity;

import constant.ItemGroup;

import java.util.Arrays;

public class SalesList implements Input {
    SalesAgent salesAgent;
    Item[] item;
    //
    SalesAgent[] salesAgents;
    Item[] items;

    public SalesList() {
    }

    public SalesList(SalesAgent[] salesAgents, Item[] items) {
        this.salesAgents = salesAgents;
        this.items = items;
    }

    public void inputInfor() {
        do {
            int id = InputValue.inputIntegerNumber("Nhập vào mã nhân viên cần lập bảng bán hàng: ", 1000);
            if (searchID(id) != -1) {
                this.salesAgent = salesAgents[searchID(id)];
                break;
            }
            System.out.println("không có người này trong danh sách nhanh viên, nhập lại !!!");
        } while (true);
        int numberOfItems = InputValue.inputIntegerNumber("Nhập số lượng mặt hàng đã bãn trong hôm nay: ", 1, 5);
        Item temp = new Item();
        for (int i = 1; i <= numberOfItems; i++) {
            do {
                int idItem = InputValue.inputIntegerNumber("Nhập mã mặt hàng đã bán", 1000);
                if (searchIDItems(idItem) != -1) {
                    temp = items[searchIDItems(idItem)];
                    save(temp);
                }
                System.out.println("mã mặt hàng bạn nhập không tồn tại, vui lòng nhập lại");
            } while (true);
        }
    }

    private void save(Item temp) {
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                item[i] = new Item();
                item[i] = temp;
            }
        }
    }

    private int searchIDItems(int id) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getItemCode() == id) {
                return i;
            }
        }
        return -1;
    }

    private int searchID(int id) {
        for (int i = 0; i < salesAgents.length; i++) {
            if (salesAgents[i] != null && salesAgents[i].getStaffCode() == id) {
                return i;
            }
        }
        return -1;
    }

    public SalesAgent getSalesAgent() {
        return salesAgent;
    }

    public void setSalesAgent(SalesAgent salesAgent) {
        this.salesAgent = salesAgent;
    }

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "SalesList{" +
                "salesAgent=" + salesAgent +
                ", item=" + Arrays.toString(item) +
                ", salesAgents=" + Arrays.toString(salesAgents) +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
