package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class SelfPractice {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many number you want to enter?");
        int size=scan.nextInt(); //5

        int []arr= new int [size];

        for (int i=0; i<size;i++){
            System.out.println("Enter a number");
             arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int []arr2= new int [size];

         int j=arr.length-1;
        for(int each:arr){
            arr2[j]=each;
            j--;
        }
        System.out.println(Arrays.toString(arr2));
    }


}
