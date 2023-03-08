package demo_list;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Main4 {
    public static void main(String[] args) {
        Vector<String> stringVector = new Vector<>();
        stringVector.addElement("A");
        stringVector.addElement("B");
        System.out.println(stringVector);
        System.out.println(stringVector.size()); // kích thức các phần tử được khai báo
        System.out.println(stringVector.capacity()); // khi khởi tạo thì mặc định có
        stringVector.trimToSize(); // loại các phần tử rỗng
         // stack
        List<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        stack2.push("A");
        stack2.push("B");
        stack2.push("C");

    }

}
