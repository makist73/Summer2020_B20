package Office_Hours.Practice_07_27_2020;

import javax.rmi.CORBA.StubDelegate;
import java.util.Arrays;

public class CombineTwoArrays3 {
    public static void main(String[] args) {
        String[]a1={"Tetina","Hamit", "Phorsni"};
        String[]a2={"Aoala","Zeki","Chris","Dawut"};

        String []students= new String[a1.length+a2.length];

        for (int i=0; i <=a1.length-1;i++){
            students[i]=a1[i];
        }
         for (int i=0; i<=a2.length-1; i++){
             students[i+a1.length]=a2[i];
         }

        System.out.println(Arrays.toString(students));
    }
}
