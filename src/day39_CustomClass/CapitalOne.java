package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {

    Employee employee1=new Employee();
    Employee employee2=new Employee();
    Employee employee3=new Employee();
    Employee employee4=new Employee();
    Employee employee5=new Employee();
    Employee employee6=new Employee();

    employee1.setEmployeeInfo("Roman",'M',"123454332","QA",110000);
    employee2.setEmployeeInfo("Carol",'F',"345433652","QA",120000.50);
    employee3.setEmployeeInfo("Ali",'M',"123459982","SDET",130000);
    employee4.setEmployeeInfo("Ramazan",'M',"563454332","SDET",150000);
    employee5.setEmployeeInfo("Tetiana",'F',"463454332","SDET",140000);
    employee6.setEmployeeInfo("Virginia",'F',"563454331","BA",150000.70);

    ArrayList<Employee> employeeList= new ArrayList<>();
    employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6));

    double max =Integer.MIN_VALUE;
    String name="";
    for (Employee each: employeeList){
        double eachSalary=each.salary;
        if (eachSalary>max){
            max=eachSalary;
            name=each.name;
        }
    }

        System.out.println("Maximum Salary: "+max);
        System.out.println("Name: "+name);

        System.out.println("========================================");

        //employeeList.removeIf( each -> each.salary > 135000 );
        //employeeList.removeIf( each -> each.jobTitle.equals("QA") );
        // employeeList.removeIf( each -> each.name.toLowerCase().contains("m") );
        employeeList.removeIf( each -> each.name.charAt(0) == 'R' );

        for( Employee each: employeeList) {
            // each.getEmployeeInfo();
            System.out.println(each.name + " : " + each.salary);

        }
    }
}
