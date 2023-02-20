package objects;

import constants.ReaderType;

import java.util.Scanner;

public class Reader extends Person {
    private static int AUTO_READER_CODE = 10000;
    private int readerCode;
    private ReaderType readerType;

    public Reader() {
        this.readerCode = AUTO_READER_CODE;
        AUTO_READER_CODE++;
    }
    public Reader(ReaderType readerType) {
        this.readerCode = AUTO_READER_CODE;
        AUTO_READER_CODE++;
        this.readerType = readerType;
    }
    @Override
    public void input(){
        super.input();
        System.out.println("1. Sinh viên \n2.Học viên cao học\n3.Giảng viện");
        int choose;
        do{
            System.out.println("Nhập lựa chọn của bạn: ");
            choose = new Scanner(System.in).nextInt();
            if(choose >0 && choose <4){
                break;
            }
            System.out.println("Nhập sai yêu cầu nhập lại");
        }while (true);
        switch (choose){
            case 1:
                readerType = ReaderType.STUDENT;
                break;
            case 2:
                readerType = ReaderType.GRADUATE_STUDENT;
                break;
            case 3:
                readerType = ReaderType.TEACHER;
                break;
        }
    }
    @Override
    public void print(){
        super.print();
        System.out.printf("%-20d",readerCode);
        System.out.printf("%-30s\n",readerType.getReaderType());
    }

    public int getReaderCode() {
        return readerCode;
    }
    public ReaderType getReaderType() {
        return readerType;
    }

    public void setReaderType(ReaderType readerType) {
        this.readerType = readerType;
    }
}
