package StringAndDate;
import java.time.*;
import java.util.Date;

public class StringAndDate {
    String str = "This is string";
    String str2 = new String("This is another string");
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    public void displayString() {
        System.out.println(str.concat(str2));
    }
    public void displayDateAndTime() {
        System.out.println(localDate);
        System.out.println(localTime);
    }
}
