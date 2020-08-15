package day29_CustomMethods;

import sun.security.timestamp.TSRequest;

public class RemoveDublicates {
// 10. write a method that can remeove the duplicates from the string

    public static void main(String[] args) {
        String str="ababbabaaancnnnnnvvvcccceeee";
                        //abncve
        removeDup(str);
    }
    public static void removeDup(String str){ // "abab"
        String nonDup=""; // "ab"
                        // [a,b,a,b]
       for(String each :str.split("")){
           if(!nonDup.contains(each)){
               nonDup+=each;

           }
       }
        System.out.println(nonDup);
    }
}
