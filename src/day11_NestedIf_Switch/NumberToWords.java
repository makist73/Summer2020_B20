package day11_NestedIf_Switch;
/*
 1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".

 */
public class NumberToWords {
    public static void main(String[] args) {

        int num = 4;
        String result="";
        if (num == 1) {
        //   result
        } else if (num == 2) {
            System.out.println("two");
        } else if (num == 3) {
            System.out.println("three");
        } else if (num == 4) {
            System.out.println("four");
        } else if (num == 5) {
            System.out.println("five");
        } else if (num == 6) {
            System.out.println("six");
        }else if (num==7){
            System.out.println("seven");
        }else if(num==8){
            System.out.println("eight");
        }else if(num==9){
            System.out.println("nine");
        }else if (num==0){
            System.out.println("zero");
        }else{
            System.out.println("Invalid");
        }
    }
}