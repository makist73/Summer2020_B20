package day07Unary_Shorthand;
/* write a program that can verify if a number is positive, negaive, 0
    number =120;
            Output:
            120 is a positive number? true
            120 is negative number? false
            120 is zero? false
*/
public class Positive_Negative_0 {

    public static void main(String[] args) {
        int num = 100;

        boolean positive = num > 0;
        boolean negative = num < 0;
        boolean zero  = num ==0;


        System.out.println(num + " is a positive? "+positive);
        System.out.println(num + " is a negative? "+negative);
        System.out.println(num + " is zero? "+zero);


    }
}
