package day41_toString;

class TesterObject {

    public static void main(String[] args) {

        Tester[] testers = {new Tester(), new Tester(), new Tester(), new Tester(), new Tester(), new Tester()};

        testers[0].setInfo("Ahmet", 105000, "Male", 30);
        testers[1].setInfo("Mehmet", 135000, "Male", 33);
        testers[2].setInfo("Nazli", 115000, "Female", 32);
        testers[3].setInfo("Hasan", 125000, "Male", 47);
        testers[4].setInfo("Nazan", 115000, "Female", 32);
        testers[5].setInfo("Hasan", 125000, "Male", 47);

        for (Tester each : testers) {
            System.out.println(each);
        }

    }
}

public class Tester {

    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary,String gender, int age){
       this.name= name;
       this.salary=salary;
        this.gender= gender;
        this.age=age;

    }

    public String toString(){
        return "Name:"+name+", Gender "+gender+", Age:"+age+", Salary: "+salary;
    }
}


