public class DemoString01 {
    public static void main(String[] args) {
        String s1 = "hello";
//        String S2 = new String("hello");
        String s2 = "World";
//        String s4 = s1 + " " + s2;
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("-----------------");
        String s10= "my computer";
        System.out.println(s10.lastIndexOf("co"));
        System.out.println("----------");
        String s20 ="  hihiIII  IJJjjjj     ";
        System.out.println(s20.toLowerCase());
        System.out.println(s20.trim());
        System.out.println(s20.substring(3,5));
        System.out.println(s20.replace("hi","hehe"));
        System.out.println("----------------");
        String s30 ="Nguyen Van Abc";
        String[] ketqua = s30.split(" ");
        System.out.println("------------");
        System.out.println("hihihihh \" tuan anh day \"");
    }
}
