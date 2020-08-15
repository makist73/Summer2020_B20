package day07Unary_Shorthand;
      /*year = 2020  ==> short;
        LeapYear =true/false;
*/
public class LeapYear {

    public static void main(String[] args) {
        int year = 2021;
           boolean result = year % 4 == 0;
        System.out.println("Year " +year +" is a leap year: " +result); // 2021 is a leap year: false

    }
}
