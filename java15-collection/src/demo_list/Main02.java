package demo_list;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List list1 = new ArrayList(); // không giới hạn
        List<Integer> list2 = new ArrayList<>(); // giới hạn chỉ chứa số nguyên
        list2.add(234);
        list2.add(Integer.valueOf("12414"));
    }
}
