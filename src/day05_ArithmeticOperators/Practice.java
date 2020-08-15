package day05_ArithmeticOperators;

public class Practice {
    public static void main(String[] args) {

        int a = 5+2*4;   // 13
        System.out.println(a);   //5+8==> 13

        int b = 10/2-3;  // 2
        System.out.println(b);   // 5-3 = 2

        int c = 8+12*2-4;
        System.out.println(c); // 8+24-4==> 32-4=28

        int d = 4 + 17 % 2-1;
              // 4+  1-   1==> 5-1=4
        System.out.println(d); // 4

        int e = 6-3*2+7-1;
        System.out.println(e);  //6-6+7-1==> 0+7-1=6


        System.out.println( 5 + 5 / 5 ); //6
        System.out.println( (5+5) /5 ); // 2
                          // 10  / 5 = 2

        System.out.println( (5+5) / 5.0 );  //2.0


        double y = 5 * 2 / 3.0 + (4 * 3);
        //          5 * 2 /3.0 + 12
        //           10 / 3.0 + 12
        //            3.333 + 12 = 15.3333

        System.out.println(y);

        double t = 10/3;  // 3.0
        System.out.println(t);


    }


}
