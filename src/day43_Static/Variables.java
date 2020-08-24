package day43_Static;

public class Variables {
    int d;  //instance variable, don't need to be initialise
  static int s;

    public void method2(){
        System.out.println(d);
        System.out.println(s);
    }

    public static void main(String[] args) {
      //  System.out.println(a);
        System.out.println(s);

        //System.out.println(d);// Static ONLY accepts static

        Variables obj=new Variables();
        System.out.println(obj.d);
    }

    public static void method1(){
        int a;       //local variable

        if (true){
            int b=20;  // local variable also
        }

       // System.out.println(b);

        // System.out.println(a);
    }

}
