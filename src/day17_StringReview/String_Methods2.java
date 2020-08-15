package day17_StringReview;

public class String_Methods2 {

    public static void main(String[] args) {
        String s1 ="Cat";// String pool
        String s2 = new String("Cat"); // heap
        String s3 = new String("Cat"); // heap

        // equals
        System.out.println(s1 == s2);  // false
        System.out.println(s1.equals(s2)); // true

        System.out.println(s2 == s3);  // false
        System.out.println(s2.equals(s3)); // true

        // equalsIgnoreCase
        String s4 ="java";
        String s5 = "Java";

        System.out.println(s4.equals(s5));  //false
        System.out.println(s4 == s5);  // false

        System.out.println(s4.equalsIgnoreCase(s5));  // true

        String s6= "MuHtAr";
        String s7 = "muhtar";
        System.out.println(s6.equalsIgnoreCase(s7));  // true
        System.out.println(s6.equals(s7)); // false


        // isEmpty: checks if the length of the string is 0
        String str ="  ";
        System.out.println(str.isEmpty());  //false

        str= str.trim(); // ""

        System.out.println(str.isEmpty()); // true

        String str2 = "Cybertek"; // length !=0
        System.out.println(str2.isEmpty());  // false

        str2 = ""; // length ==0
        System.out.println(str2.isEmpty());  // true'

        // contains:checks inculuded or not

        String str3 = "Java, C#, Pthon,Ruby, C++";
        System.out.println(str3.contains("Java"));  // true
        System.out.println(str3.contains("java"));  // false

       //  System.out.println(str3.toLowerCase().contains("java"));  // true

        String str4 ="ABCD";
        System.out.println(str4.contains("D"));  // true

        // startsWith & endsWith:

        String str5 = "CYbertek";
        System.out.println(str5.startsWith("C"));  // true
        System.out.println(str5.startsWith("E") || str5.startsWith("C"));
        //                  false ||                true ==> true

        System.out.println(str5.startsWith("CybABC")); // false

        String str6 = " Today is a great day";

        System.out.println(str6.endsWith("day"));  // true
        System.out.println(str6.endsWith("great"));  // false






    }
}


