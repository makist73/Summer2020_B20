package day14_Recap;

import java.util.Scanner;

public class nextLine_vs_Rest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt(); //19Enter

        input.nextLine(); //takes Enter
        System.out.println("Enter your full Name: ");
        String fullName = input.nextLine();
        System.out.println(fullName+ " is "+age+ " years old");

    }
}
