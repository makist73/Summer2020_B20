package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class CombineTwoArraysWithForEachLoop {

    public static void main(String[] args) {

        char [] a1={'A','B','C','H'};
        char[] a2={'D','E','F','G'};

        char[] a3= new char[a1.length+a2.length]; // {'A','B','C','D','E','F'}
        /*
   //     index
        a3[0]=a1[0]; //A
        a3[1]=a1[1]; //B
        a3[2]=a1[2]; //C

        a3[3]=a2[0]; //A
        a3[4]=a2[1]; //B
        a3[5]=a2[2]; //C
    */
        int index=0;
        for(char each: a1) {
            a3[index] = each;
            index++;
        }

        for(char each:a2){
            a3[index]=each;
            index++;


        //int j=a1[0];
       // for(int i=0; i<=a3.length-1; i++){



        }
        System.out.println(Arrays.toString(a3));




    }
}
