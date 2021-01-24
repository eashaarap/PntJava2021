package oop.abtraction;

public class GeneralMotors implements Car {

    /*
        Concrete Class: implements another interface;
         - we can reassign interface values inside concrete classes
     */

    String brand = "BMW";

    String carModel = "M23";
    String modelYear = "2023";
    static double price = 70000;
    int gmCarQty;

    public static void carInfo(){
        System.out.println("This is General Motor car information ");
    }
    public boolean willBeAvailable(boolean availability){
        boolean releaseMonth = availability;
        return releaseMonth;
    }

    public void startCar() {
        System.out.println("GeneralMotor car has a start feature");

    }

    public void stopCar() {
        System.out.println("GeneralMotor car has a stop feature");
    }

    public void wheelCar() {
        System.out.println("GeneralMotor car has a wheel");
    }

    public void engineCar() {
        System.out.println("GeneralMotor car has a engine");
    }

    public void accelerationCar() {
        System.out.println("GeneralMotor car has acceleration");
    }

    public void steeringCar() {
        System.out.println("GeneralMotor car has a ");

    }

    public void brakeCar() {
        System.out.println("GeneralMotor car has a brake");

    }

    public void navigationCar() {

    }

    public void carDisplay() {

    }
}
