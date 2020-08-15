package day04_Variables;
/*
    first name
    last name
    country
    SSN
    Gender
    IsEmployeed
     */

public class PersonalInfo {
    public static void main(String[] args) {

        String firstName = " Hamid";
        String lastName  = "Aliyev";
        int age = 35;
        String country = "Azerbaijan";
        char gender = 'M';
        boolean isEmployed = true;
        String SSN = "123-456-789";

        System.out.println("FirstName is " +firstName);
        System.out.println("LastName is " + lastName);
        System.out.println("Age: "+ age);
        System.out.println("Country: "+ country);
        System.out.println("Gender: "+ gender);
        System.out.println("IsEmployed: "+ isEmployed);
        System.out.println("SSN: " + SSN);

    }
}
