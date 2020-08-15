package day33_LocalDateTime;


import java.text.DecimalFormat;

public class FormatDecimals {
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.00");
        double a =22/7.0;
        System.out.println(a);
        System.out.println(df.format(a));

        // 6.6785678844667
        System.out.println(df.format(6.6785678844667));  //6.68

    }
}
