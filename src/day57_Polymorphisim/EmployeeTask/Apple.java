package day57_Polymorphisim.EmployeeTask;

import day35_ArrayList.ArrayList_Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {


    public static void main(String[] args) {

        Employee tester1 =new Tester("Hakki",20211, "QA",100000,'M');
        Employee tester2 =new Tester("Mike",20212, "QA",100000,'M');

        Employee developer1=  new Developer("Ivan",20213, "DevOp",120000,'M');
        Employee developer2=  new Developer("Zarina",20214, "DevOp",120000,'F');

        Employee scrumMaster= new ScrumMaster("Yaro", 20215, "SM", 125000, 'M');

    //    scrumTeam (data structer)

        ArrayList<Employee> scrumTeam= new ArrayList<>();
        scrumTeam.addAll(Arrays.asList( scrumMaster,tester1,tester2,developer1,developer2));

        for (Employee each : scrumTeam) {

            System.out.println(each);
        }

    }
}
