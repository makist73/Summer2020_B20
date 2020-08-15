package day19_ForLoop;

import day13_Scanner.Scanner_next;

import java.util.Scanner;

public class PalindmeTest {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String str = scan.nextLine();
        String reverseStr ="";

        for(int i = str.length()-1; i >= 0; i--){
           // reverseStr+= str.charAt(i);
            reverseStr += str.substring(i, i+1);
        }
        System.out.println(reverseStr);

        System.out.println(str.equals(reverseStr));

    }
}
