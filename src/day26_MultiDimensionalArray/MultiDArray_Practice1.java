package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDArray_Practice1 {
    /*
        Testers: {"Lilia" , "Odina"," Cristina", " Elkem"}
        Developers:{ "Ahmet" , "Erfan","Roza", "Sarah"}
        SM:{"Nurmamet"}
        PO:{"Nadir"}
        BA:{"Alex"}
        scrumTeam: testers, developers, SM,PO,BA
     */
    public static void main(String[] args) {

        String[] testers = {"Lilia", "Odina", " Cristina", " Elkem"};
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {"Nurmamet"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};

        String[][] scrumTeam = {testers, developers, SM, PO, BA};
        //                 0        1         2  3    4

        String[] testers2 = {"Irene", "Aslan", "Nazar"};

        scrumTeam[4][0] = "Adam";
        scrumTeam[1][2] = "Emine";
        scrumTeam[0] = testers2;
        scrumTeam[3][0] = "Zeki";

        System.out.println(Arrays.deepToString(scrumTeam));

        System.out.println("=======================");
        for (String[] each : scrumTeam) {
           // for () ;
        }


        System.out.println("===============================");

        int[][] scores = {{10, 20, 30, 45}, {60, 55, 75, 105}, {93, 48, 125, 135}};
        //                         0            1               2
        // print out the numbers that are divisible by 3 or 5

        for (int[] each1DArray : scores) {
            for (int eachElement : each1DArray) {
                if (eachElement % 3 == 0 || eachElement % 5 == 0) {
                    System.out.println(eachElement + " ");
                }
            }


        }
    }
}