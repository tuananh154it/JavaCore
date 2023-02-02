import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate localDate = now.minusDays(-3);
        System.out.println("ba ngay truoc : " + localDate);
        LocalDateTime ngayHomNay = now.atStartOfDay();
        System.out.println(ngayHomNay);
        System.out.println("-----------------");
        System.out.println(now.getDayOfWeek());
        System.out.println("thang : "+ now.getDayOfYear());
//        System.out.println(now.isAfter(2022,11,4));

    }
}
