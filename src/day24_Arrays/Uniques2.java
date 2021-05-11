package day24_Arrays;


public class Uniques2 {
    public static void main(String[] args) {

        String str = "aabccd";
        String expectedResult = "";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // a,a,b,c,c
            int count = 0; // frequency of ch
            for (int i = 0; i < str.length(); i++) { // this for loop used for finding the frequency of ch and assign it to count
                char each = str.charAt(i);  //a,a,b,c,c
                if (ch == each) {
                    count += 1;
                }
            }

            if (count == 1) {   // if it only occurred on time
                expectedResult += ch;
            }
        }
        System.out.println(expectedResult);
    }
}