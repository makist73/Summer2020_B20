package day43_Static;

public class Static_VS_Instance {

    static int staticVariable; // 1 copy
    int instanceVariable; // 2 or more copies

    public static void main(String[] args) {

        Static_VS_Instance obj1=new Static_VS_Instance();
        obj1.instanceVariable=100;
        obj1.staticVariable=500;

        Static_VS_Instance obj2=new Static_VS_Instance();
        obj2.instanceVariable=200;
        obj2.staticVariable=400;

        System.out.println(obj1.instanceVariable);  // 100
        System.out.println(obj2.instanceVariable); // 200

        System.out.println("==============================");

        System.out.println(obj1.staticVariable);  //400  calling the static variable true the object is not preferred way
        System.out.println(obj2.staticVariable);   //400

        System.out.println(Static_VS_Instance.staticVariable); // calling from class name is preferred way for static variables
    }


}
