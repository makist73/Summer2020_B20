package day13_Scanner;

import java.util.Scanner;

public class nextLine_VS_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //120000Enter
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble(); // 120000
        scan.nextLine();//Enter ( we use this to take out the ENTER that is left in the scanner)

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name: "+fullName);




    }
}
