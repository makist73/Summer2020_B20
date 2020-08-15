package day29_CustomMethods;

public class Eligibility {
    /* 4. check eligibility to vote
    name,age,citizen,
        5.check eligible to buy alcohol
     */

    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("go grab a milk");
        }
    }

    public static void main(String[] args) {
        vote("john", 28,true,"Biden");
        vote("Daniel",17, true,"Kanye");

        eligibleToBuyAlcohol(true,19);

        calculator(100,'/',20);
    }
    public static void vote(String name, int age,boolean citizen, String candidatetName){
        boolean eligibleToVote    = age>=18 && citizen==true;
        if(eligibleToVote){
            System.out.println(name+" is eligible to vote for "+candidatetName);
        }else{
            System.out.println(name+" is not eligible to vote for "+candidatetName);
        }


    }


    public static void calculator(double num1,char operator, double num2){
        // +, -, *, /, %, invalid

        switch (operator){
            case '+':
                System.out.println("Addition:"+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication:"+(num1*num2));
                break;
            case '/':
                System.out.println("Division: "+(num1/num2));
                break;

            case '%':
                System.out.println("Remainder:"+(num1%num2));
                break;
            default:
                System.out.println("Invalid Operator");

        }
    }

}
