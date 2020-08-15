package day21_Loops;

public class DoWhile {
    public static void main(String[] args) {

        boolean result = false;
        while (result) {
            System.out.println("Hello World");
        }

        System.out.println("==========================");

        do {// just do it first and if its true do it again, if not dont do it again
            System.out.println("Hello World");
        } while (result);

    }
}
