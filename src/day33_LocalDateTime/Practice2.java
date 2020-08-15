package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {
        String[] students = {"Isa", "Musa", "Hasan", "Huseyin", "Ayse"};
        LocalDate[] birthDays = {
                LocalDate.of(1983, 1, 25),
                LocalDate.of(1973, 6, 3),
                LocalDate.of(1980, 5, 23),
                LocalDate.of(1987, 12, 5),
                LocalDate.of(1972, 5, 14)
        };

        DateTimeFormatter dateFormat =DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        // Hasan : May/23/80 Monday


        for (int i=0; i<=students.length-1; i++){
            System.out.println(students[i]+" : "+birthDays[i].format(dateFormat));
        }
    }
}