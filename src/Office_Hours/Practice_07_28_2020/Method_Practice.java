package Office_Hours.Practice_07_28_2020;

import javafx.collections.ArrayChangeListener;

import java.util.ArrayList;

public class Method_Practice {

    // Access-Modifier Specifier Return-type Name(Parameter){ Statement }

    public static void main(String[] args) {
        String name ="Muhtar";

      String reverseName =reverseStr(name);
        System.out.println(reverseName);
            // or
       System.out.println(reverseStr(name));

        System.out.println(reverseName.toUpperCase());

        palindrome("level");
        palindrome(name);

        System.out.println("=====================================");

        String[]names ={"Aslan","Ramazan","Alex","Erfan","Aalia","Anna"};

        ArrayList<String>nameList=new ArrayList<>();

        for (String each:names){

           // System.out.println(reverseStr(each));
          //  palindrome(each);

            nameList.add(reverseStr(each));
            System.out.println(nameList);
        }
    }

    public static String reverseStr(String str){  // "ABC"
        String result ="";  // CBA


        for (int i=str.length()-1; i>=0; i--){
            result += str.charAt(i);  // CBA
        }

        return result;
    }

    public static void palindrome(String str){ // ABC
        String reversedStr=reverseStr(str); //CBA
        boolean palindrome = str.equalsIgnoreCase(reversedStr);  // don't use ==

        System.out.println(palindrome?str +" Is Palindrome": str+" is not Palindrome"    );

    }

}
