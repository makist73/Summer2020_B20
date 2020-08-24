package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatsObjects2 {
    public static void main(String[] args) {

    Cat cat1=new Cat();
    cat1.setCatInfo("Cass", 2,'F',"Black","Persian");

           Cat[] catPark= {cat1, new Cat(),new Cat(),new Cat(),new Cat(),new Cat()};

    catPark[1].setCatInfo("Puki",3,'M',"Orange","British");
    catPark[2].setCatInfo("Cookie",1,'M',"White","British");
    catPark[3].setCatInfo("Miaw",2,'M',"Black","British");
    catPark[4].setCatInfo("Yoyo",3,'F',"Yellow","British");
    catPark[5].setCatInfo("Lord",8,'M',"Mix","British");

        ArrayList<Cat>femaleCats= new ArrayList<>();
        femaleCats.addAll(Arrays.asList(catPark));
        femaleCats.removeIf(p->p.gender=='M');

        ArrayList<Cat>maleCats=new ArrayList<>();
        maleCats.addAll(Arrays.asList(catPark));
       // maleCats.removeAll(femaleCats);
        maleCats.removeIf(p-> p.gender=='F');

        System.out.println("Number of female cats: "+femaleCats.size());
        System.out.println("Number of male cats: "+maleCats.size());
    }
}
