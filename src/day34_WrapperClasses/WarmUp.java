package day34_WrapperClasses;
/*
1. use the LocalDate & Time get the current date and time in the following format:
			Sunday, 10:28 AM, Jul/26/2020
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WarmUp {
    public static void main(String[] args) {

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern(("EEEE, hh:mm a, MMM/dd/yyyy"));

        LocalDateTime today=LocalDateTime.now();

        System.out.println(today);
        System.out.println(today.format(dtf));

    }
}
