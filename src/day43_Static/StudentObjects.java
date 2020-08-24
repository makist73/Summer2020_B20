package day43_Static;

public class StudentObjects {

    public static void main(String[] args) {

      CybertekStudent obj1= new CybertekStudent();
      obj1.studentName="Ivan";
      obj1.age=22;


      CybertekStudent obj2= new CybertekStudent();
      obj2.studentName="Christina";


        System.out.println(obj1.studentName);
        System.out.println(obj1.age);
        System.out.println(obj2.studentName);

        System.out.println(obj1.schoolName);  // not preferred
        System.out.println(obj2.schoolName);  // not preferred

        System.out.println(CybertekStudent.schoolName); // preferred

    }

}
