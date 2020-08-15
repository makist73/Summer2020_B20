package day39_CustomClass;

public class CarObjects {

    public static void main(String[] args) {

        Car car1=new Car();
          /*  car1.brand="Toyota";
            car1.model="Corolla";
            car1.year=2020;
            car1.color="White";
            car1.mileage=30000;
            car1.price=19000.50;
*/

 car1.setCarInfo("Toyota","Corolla",2019,"White",3000,15000);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println("====================================");

        Car car2=new Car();

        /*  car2.brand="BMW";
            car2.model="450";
            car2.year=2019;
            car2.color="Black";
        */

        car2.setCarInfo("BMW","450",2018,"Black",12000,22000);

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        System.out.println("===========================");

        Car mycar= new Car();

        mycar.setCarInfo("Ford","Mustang",2007,"Blue",124000,7000);
        mycar.getCarInfo();

        System.out.println("==========================================");

        Car myWIfeCar=new Car();
        myWIfeCar.setCarInfo("Nissan","Altima",2016,"Black",102000, 12000);
        myWIfeCar.getCarInfo();

    }
}
