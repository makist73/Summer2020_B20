package day31_Recap;
import Library.Util;
import javafx.beans.binding.StringExpression;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AABBBCCCDDDDDDDEEEEEEEEEFFFFFFF";//==>A2B3C3

        String expectedResult =""; // A2B3C3

        String nonDup = Util.removeDup(str);   //ABC
        /*
        for (char each : nonDup.toCharArray()){
            int count1=Util.frequency(str, each);
            expectedResult += ""+each + count1;
        }
         */

        for(int i = 0; i<= nonDup.length()-1; i++){

            char ch1= nonDup.charAt(i);         //A B C
            int count1 = Util.frequency(str,ch1); //2 3 3

            expectedResult += ""+ch1+ count1; // A2B3C3
        }


/*
        char ch1= nonDup.charAt(0); //A
        int count1 = Util.frequency(str,ch1); //2
        expectedResult += ""+ch1+ count1;

        char ch2= nonDup.charAt(1); //B
        int count2 = Util.frequency(str, ch2);  //3
        expectedResult += ""+ch2+ count2;

        char ch3= nonDup.charAt(2); //C
        int count3 = Util.frequency(str, ch3);  //3
        expectedResult += ""+ch3+ count3;
    */

        System.out.println(expectedResult);

    }


    public static String frequencyOfChars(String str){

        String expectedResult="";
        String nonDup = Util.removeDup(str);

        for (char each : nonDup.toCharArray()){
            int count1=Util.frequency(str, each);
            expectedResult += ""+each + count1;
        }
        return expectedResult;
    }
}
