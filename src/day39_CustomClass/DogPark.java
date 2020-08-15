package day39_CustomClass;

public class DogPark {

    public static void main(String[] args) {
        // dogPark

        Dog dog1=new Dog();

        Dog[] dogPark={new Dog(), new Dog(), new Dog(),new Dog(),new Dog()};
                //          0           1       2           3         4

    dogPark[0].setDogInfo("Tucker","German Shepperd","Medium",1 ,"Black");
    dogPark[1].setDogInfo("Roko","Retriver","Big",5 ,"yellow");
    dogPark[2].setDogInfo("Lucker","German Shepperd","Medium",2 ,"Brown");
    dogPark[3].setDogInfo("Akbas","Anatolian Shepperd","Large",6 ,"yellow");
    dogPark[4].setDogInfo("Bucker","BoxerPitt","Large",4 ,"White");
    //dogPark[5].setDogInfo("Pasa", "Pitbull","large", 1, "White");

        for (int i=0; i<=dogPark.length-1; i++){
            dogPark[i].getDogInfo();
        }


        System.out.println("=============================================");

        for (Dog eachDog:dogPark){
             eachDog.getDogInfo();
        }

        System.out.println("=========================================");
        String food="treats";
        for (Dog eachDog:dogPark){
            eachDog.eat(food);
        }

        System.out.println("=========================================");
        String drink="milk";
        for (Dog eachDog:dogPark){
            eachDog.drink(drink);
        }

        System.out.println("=========================================");
       // play
        for (Dog eachDog:dogPark){
          eachDog.play();

        }
        System.out.println("=========================================");
        // sleep
        for (Dog eachDog:dogPark){
            eachDog.sleep();
        }
    }
}
