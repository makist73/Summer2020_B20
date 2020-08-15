package day07Unary_Shorthand;

// write a program that can check if a number is evenly divisible by 2, 3, 5

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class Divisible_2_3_5 {
    public static void main(String[] args) {

        int number = 25;
         boolean divisibleBy2 = number %2 == 0;
         boolean divisibleBy3 = number %3 == 0;
         boolean divisibleBy5 = number %5 == 0;

        System.out.println( number +" is evenly divisible by 2: "+divisibleBy2);
        System.out.println( number +" is evenly divisible by 3: "+divisibleBy3);
        System.out.println( number +" is evenly divisible by 5: "+divisibleBy5);
    }

}
