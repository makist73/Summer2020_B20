package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setCarInfo("Lexus","RX350",2019,"Gray",10000,20000);
        car2.setCarInfo("Lexus","RX450",2018,"White",9000,19000);
        car3.setCarInfo("Bugatti","Veyron",2018,"Gray",15000,32000);
        car4.setCarInfo("Ford","Mustang",2016,"Blue",8000,22000);
        car5.setCarInfo("Nissan","GT-R",2015,"Black",16000,73000);


        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();
        car4.getCarInfo();
        car5.getCarInfo();

        car3.start();
        car5.start();

    }
}