package day25_Practices;
//4. Write a program that can count the even and odd number from an array of integers
public class CountOddEven {
    public static void main(String[] args) {

        int[]nums ={1,2,3,4,5,6,7,8,9,10,11};
        int countEven=0;
        int countOdd =0;

        String even="";
        String odd= "";

        for(int each:nums){
            /*
            if(each%2==0){
                countEven +=1;
                even+=each+" ";
            }else{
                countOdd++;
                odd += each+" ";
            }

             */


            if(each%2==0){
                countEven +=1;
                even +=each+" ";
                continue;
            }
            countOdd++;
            odd +=each+" ";
        }
        System.out.println(countEven+ " Even Numbers: "+even);

        System.out.println(countOdd+" Odd Numbers: "+odd);
    }
}
