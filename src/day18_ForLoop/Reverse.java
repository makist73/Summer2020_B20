package day18_ForLoop;

import java.util.Scanner;

/*
2. write a program that can reverse the following string:
                 String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
 */
public class Reverse {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        String str= "avaJ";
        //        avaJ==>ava,J
        String s1= str.substring(0,3); // ava
        String s2 = str.substring(3); //J
        System.out.println(s2+s1);

        // char ch1 = str.charAt(0);

         String result1 =s1+s2;
        System.out.println(result1); // avaJ




    }
}
