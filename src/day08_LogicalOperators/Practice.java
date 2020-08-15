package day08_LogicalOperators;

public class Practice {

    public static void main(String[] args) {
        String firstName = "Murat";
        String lastName = "Ak";
        int age = 9;
        String citizenShip ="USA";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        //                        19 >= 18  && "China"  = "USA"
        //                          true    &&  false
        System.out.println(eligibleToVote);

        String fullName = firstName+" " + lastName;
        System.out.println(fullName+" is eligible to vote: "+ eligibleToVote);




    }
}
