package day39_CustomClass;

public class Employee {
    /*
    Attributes:
                 employeeName, gender, SSN,jobTitle,salary
     */
    String name;
    char gender;
    String SSN;
    String jobTitle;
    double salary;

    public void setEmployeeInfo(String employeeName, char employeeGender,String employeeSSN, String employeejobTitle, double employeeSalary) {

        name=employeeName;
        gender=employeeGender;
        SSN=employeeSSN;
        jobTitle=employeejobTitle;
        salary=employeeSalary;
    }

    public void getEmployeeInfo(){
    System.out.println("Name: "+name+", Gender: "+gender+", JobTitle: "+jobTitle+", Salary "+salary);
    SSN=SSN.substring(SSN.length()-4);
    System.out.println("Last four digits of SSN "+SSN);


        }
    }

