package day20_WhileLoops;

public class BranchingStatement {

    public static void main(String[] args) {

        char ch= 'A';
        while( ch<='E'){
            if(ch=='C'){
              ch++;
                continue; //skips everything even the iterator
                // break;
            }
            System.out.println(ch);

            ch++;
        }

  /*      if(true){
            System.out.println("Started");
            System.exit(0);
        }
        System.out.println("Done");

*/
        boolean a = true;
        while(a){
            System.out.println("Test started");
            //break;

            System.exit(0);
        }

         System.out.println("Completed");
    }
}
