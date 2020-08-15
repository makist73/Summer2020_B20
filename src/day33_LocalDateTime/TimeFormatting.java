package day33_LocalDateTime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class TimeFormatting {
    /*
    year:yy,yyyy
    Month:MM(number), MMM(three letters), MMMM(full name)
    days:dd
    days name:E(three letters),EEEE(full name)- "EEEE,MMM/dd/yyyy" "MMM/dd/yyyy, E"
 */

    public static void main(String[] args) {

        DateTimeFormatter dateFormat= DateTimeFormatter.ofPattern("EEEE,MMM/dd/yyyy");
        LocalDate ld=LocalDate.of(2020,7,25);

        System.out.println(ld);
        System.out.println(ld.format(dateFormat));

    /*
        hours:hh
        minutes:mm
        seconds:ss
        am/pm:a
     */
        DateTimeFormatter timeFormat= DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now=LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));


        // May/20/19 Dayname 4:30 pm
    DateTimeFormatter DTFormat=DateTimeFormatter.ofPattern("MM/dd/yy EEEE hh:mm a");
    LocalDateTime time1 =LocalDateTime.of(2019,5,20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println( LocalDateTime.now().format(DTFormat));


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now=LocalDateTime.now();
        System.out.println(Now); //2020-07-25T16:36:44.669

        System.out.println(Now.format(dtf)); //Saturday 4:34:45 pm

    }
}
