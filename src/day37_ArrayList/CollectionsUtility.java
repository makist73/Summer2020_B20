package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,98,67,45,-1,-3,100,5000));

        // maximum number:
        Integer max=Collections.max(list);

        //minimum number:
        Integer min = Collections.min(list);

        System.out.println("Maximum Number: "+max);
        System.out.println("Minimum Number: "+min);


        System.out.println("===========================");

        ArrayList<String > names = new ArrayList<>();
        names.addAll(Arrays.asList("Ramazan","Irem","Muhtar", "Saim","Muhtar","Asiya"));

        //replaceAll
        Collections.replaceAll(names, "Muhtar","Fatima");

        System.out.println(names);

    }
}
