package day16_String;

public class String_Method2 {

    public static void main(String[] args) {




        // startsWith():

        String s1 = "Murat";
        System.out.println(s1.startsWith("M")); // true
        System.out.println(s1.startsWith("J")); // false

        System.out.println(s1.startsWith("Mu")); // true

        System.out.println(s1.toLowerCase().contains("mu")); // true
        //                     "murat contains mu
    }
}
