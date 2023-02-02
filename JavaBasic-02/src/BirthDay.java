import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Formatter;

public class BirthDay {
    public static void main(String[] args) throws ParseException {
        String birthDay = "2004/05/01";
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date parse = simpleDateFormat.parse(birthDay);
        int age = now.getYear() - parse.getYear();
        System.out.println("tuoi: "+age);
    }
}
