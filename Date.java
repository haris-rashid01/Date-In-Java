package p3;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

class D {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());
        System.out.println("Calendar");
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.HOUR));
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        if(c.get(Calendar.MINUTE)==40){
            System.out.println("Yeah!!!");
        }
        else{
            System.out.println("NOOOO");
        }
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt);
        String myDate = lt.format(dtf);
        System.out.println(myDate);
    }
}
