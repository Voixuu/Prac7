package pac;
import java.util.*;
public class Main {

        public static void main(String[] args) {
            Date date = new Date();
            System.out.println(date);
            GregorianCalendar calendar = new GregorianCalendar();

            calendar.setTimeInMillis(1234567898765L);

            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            System.out.println("Год: " + year);
            System.out.println("Месяц: " + month);
            System.out.println("День: " + day);
        }
    }

