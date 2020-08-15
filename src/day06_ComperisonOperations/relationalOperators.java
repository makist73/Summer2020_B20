package day06_ComperisonOperations;

public class relationalOperators {
    public static void main(String[] args) {

        boolean r1 = 10 > 9;
        System.out.println(r1); //true
        boolean r2 = 100 < 9000;
        System.out.println(r2); //true

        // >=
        boolean r3 = 87 >= 85;//true
        System.out.println(r3);

        boolean r4 = 877 >=878;//false
        System.out.println(r4);

        // <=
        boolean r5 = 200 <= 300;//true
        System.out.println(r5);

        // ==: equal
        boolean r6 = 900 == 800;//false
        System.out.println(r6);

        boolean r7 = true == false; //false
        System.out.println(r7);

        boolean r8 = "Muhtar" =="Good Guy"; //false
        System.out.println(r8);

        boolean r9 = "muhtar"== "MUHTAR"; //false
        System.out.println(r9);

        // boolean r10 = "123" == 123;

        // !=
        boolean r11 = "Muhtar" != "Bad Guy"; //true
        System.out.println(r11);

        boolean r12 = true != false; //true
        System.out.println(r12);

        boolean result1 = 'A' == 65; //true
        System.out.println(result1);

        boolean result2 = 100 == 100.0; //true
        System.out.println(result2);

        boolean result3 = 10 == (int)10.999999999999;
        System.out.println( result3);  //true

        boolean result4 = "100" =="100.0";
        System.out.println(result4);  // false

        // even: 100%2 == 0
        // odd : 100%2 != 0

        int number = 101;
        boolean even = number%2 ==0; //false
        boolean odd = number%2 != 0; //true

        System.out.println(even);
        System.out.println(odd);

    }

}
