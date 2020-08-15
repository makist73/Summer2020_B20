package day06_ComperisonOperations;

public class Implicit_Explicit {

    public static void main(String[] args) {
        short s1 = 100;
        long l1 = s1;  // implicit casting automatically done

        long l2 = (long)s1; // if we implicit manually

        int I1 = 300;
        double D1 = I1; // 300.0
        System.out.println(D1);

        double D2 = (double) I1;

        System.out.println("====================");

        double d1 = 400.55555;
        int i1 = (int)d1;
        System.out.println(i1); // 400

        long L1 = 4400;
        short sh1 = (short) L1;
        System.out.println(sh1);

        int n1 = 1000;
        byte b1 =(byte) n1;
        System.out.println(b1);  // -24

        double m1 = 34.5;
        float f1 = (float) m1;
        System.out.println(f1); // 34.5

        double m2 = 34.5;
        float f2 = (int)m2;
        System.out.println(f2); // 34

        long r1 = -500;
        int p1 = (short)r1;  // -500
        System.out.println(p1);

        long r2 = 13;
        byte t1 = (byte)r2;
        System.out.println(t1);

    }

}
