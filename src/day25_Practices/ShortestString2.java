package day25_Practices;

public class ShortestString2 {
    public static void main(String[] args) {
        String[] arr ={"Anam", "Nickolas", "Amir","Nurmamet","Tony", "Adam", "Musa","Alan"};
        int minLength = arr[0].length(); //4

        for (String each : arr){  // to find out the minumum length of the string in array

            if(each.length()< minLength){
                minLength= each.length();
            }
        }
        for (String each : arr){// to see how many strings'lengths in the array is matching with min length
           if( each.length()== minLength){
               System.out.println(each);
           }
        }
    }
}

