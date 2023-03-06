package demo;

import java.io.File;

public class Main01 {
    public static void main(String[] args) {
        File myFile = new File("C:\\Users\\phung\\Downloads\\demo.txt");
        System.out.println(myFile.length());
        System.out.println(myFile.exists());
    }
}
