package HomeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) throws ParseException {
        System.out.print("nhập vào sinh nhật (VD: 17/10/2004): " );
        String birthDay = new Scanner(System.in).nextLine();
        Date dateNow = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDayConverted = simpleDateFormat.parse(birthDay);
        System.out.println("tuổi của bạn là: "+ (dateNow.getYear()-birthDayConverted.getYear()));
    }
}
/*Bài 4: Nhập vào ngày tháng năm sinh của một người theo định dạng nhất định (nhập chuỗi), tính tuổi của
người đó (chỉ quan tâm tới năm, không cần tính chính xác tới ngày và tháng).*/