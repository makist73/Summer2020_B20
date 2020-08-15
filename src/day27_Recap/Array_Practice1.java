package day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {

    public static void main(String[] args) {
        String[] names ={"Aalina","Nurbiye","Ayse"};
        //       index:     0         1        2

        System.out.println(names[1]);

        System.out.println("======================");

        for(int i =0; i<=names.length-1; i++){
           // if(names[i].charAt(0) !='A')
            if( !names[i].startsWith("A")){
                continue;
            }
            System.out.println(names[i]);
        }
        System.out.println("=============================");

        int[]numbers =  new int[5];
        System.out.println(numbers);

        numbers[3]=25;
        numbers[0]=100;
        numbers[3]=300;


    System.out.println(Arrays.toString(numbers));

        System.out.println("===========================");
        System.out.println();
        Scanner scan = new Scanner(System.in);

        String[] students = new String[5];

        scan.nextLine(); // take out the Enter in scanner
        for(int i =0; i<= students.length-1; i++) { //i:0,1,2,3,4....
            System.out.println("Enter a name");
            students[i] = scan.nextLine();

        }

        System.out.println(Arrays.toString(students) );

    }
}
