package demo_list;

import java.util.LinkedList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("ABC");
        list.addFirst("cde");
        System.out.println(list);
    }

}
