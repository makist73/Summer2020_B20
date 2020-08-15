package day03_sequences_Variables;

public class VariablesPractices {

    public static void main(String[] args) {
        // 100, 200
        byte num1 = 100;
        short num2 =20000;
        int sum = num1+num2;

        System.out.println(sum);

        // 15000, 100000

        int num3 = 15000;
        int num4 = 100000;

        long sum1 = num3+num4;

        System.out.println(sum1);

        float num5 = 3.5f;
        double a = num5;

        // long b = num6;

        long x = 100;
        float y = x;
        double z = x;

        System.out.println(x);   // 100
        System.out.println(y); // 100.0
        System.out.println(z);   //100.0

        // int p=3.5;

        float p = 3.5f;

        float f1 = 100;
        float f2 = 100.0f;

        System.out.println(f1);
        System.out.println(f2);

    }
}
