package demo_list;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList(); // đa hình
        // chứa bất kì gì trong đấy
        // không cần nêu trước số phần tử
        list1.add(5);
        list1.add(12124);
        list2.add("true");
        list1.addAll(list2); // thêm mảng 2 vào 1
        System.out.println(list1);
        System.out.println(list1.get(2)); // lấy phần tử tại vị trí
        System.out.println(list1.indexOf(5)); // trả về vị trí đầu tiền
        System.out.println(list1.lastIndexOf(5)); // trả về vị trí cuối
        System.out.println(list1.size()); //  kiích thước của list

    }

}
