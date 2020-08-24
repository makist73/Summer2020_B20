package day41_toString;

public class Developer {

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

    public void coding(){
    System.out.println(name+" is coding");

    }

    public void fixBugs(){
        System.out.println(name+" is crying");
    }

    public String toString(){
        return "Name:"+name+", Gender "+gender+", Age:"+age+", Salary: "+salary;
    }
}


class DeveloperObject {

    public static void main(String[] args) {

        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer(),new Developer(), new Developer()};

        developers[0].setInfo("Ahmet", 105000, "Male", 30);
        developers[1].setInfo("Mehmet", 135000, "Male", 33);
        developers[2].setInfo("Nazli", 115000, "Female", 32);
        developers[3].setInfo("Hasan", 125000, "Male", 47);
        developers[4].setInfo("Nazan", 115000, "Female", 32);
        developers[5].setInfo("Hasan", 125000, "Male", 47);

        for (Developer each : developers) {
            each.coding();
        }
        System.out.println("===========================================");

        for (int i = 0; i <= developers.length - 1; i++) {
            developers[i].fixBugs();
        }

    }

}