package day33_LocalDateTime;

import java.time.LocalDate;

public class Practice1 {

    public static void main(String[] args) {
        String[]students={"Isa","Musa","Hasan","Huseyin","Ayse"};
        LocalDate[] birthDays={
                             LocalDate.of(1982,4,25),
                             LocalDate.of(1989,6,2),
                             LocalDate.of(1994,9,23),
                             LocalDate.of(1980,12,5),
                             LocalDate.of(1972,5,14)
                        };

        for(int i=0; i<=students.length-1; i++){
            System.out.println(students[i]+" : "+birthDays[i]);
        }

        System.out.println("=======================");

        for(LocalDate each :birthDays){
            if(!each.isLeapYear()){
                continue;
            }
            System.out.println(each);
        }
    }
}
