package oop.abtraction;

public class Tesla extends FlyingCar implements Car, AutoPilot{
    /*
        Concrete Class
        A class can implement multiple interface at a time but extends ONE class at a time
     */

    String teslaCarModel = "T45";
    double teslaCarT45Price = 100000;
    // method for Tesla Class only
    public void teslaCarInfo(){
        System.out.println("Tesla Car Information ");
    }



    public void startCar() {
        System.out.println("Tesla car has a start feature");

    }

    public void stopCar() {
        System.out.println("Tesla car has a stop feature");
    }

    public void wheelCar() {
        System.out.println("Tesla car has a wheel feature");

    }

    public void engineCar() {
        System.out.println("Tesla car has a engine feature");

    }

    public void accelerationCar() {
        System.out.println("Tesla car has a acceleration feature");

    }

    public void steeringCar() {
        System.out.println("Tesla car has a steering feature");

    }

    public void brakeCar() {
        System.out.println("Tesla car has a brake feature");
    }

    public void navigationCar() {
        System.out.println("Tesla car has a navigation feature");

    }

    public void carDisplay() {
        System.out.println("Tesla car has a display feature");

    }

    public void cameras() {
        System.out.println("Tesla car has a cameras feature");

    }

    public void autoLaneControl() {
        System.out.println("Tesla car has a auto lane control feature");


    }

    public void selfDriven() {
        System.out.println("Tesla car has a self Drive feature");

    }

    public void gps() {
        System.out.println("Tesla car has a gps feature");

    }

    public void autoPark() {
        System.out.println("Tesla car has a auto park feature");

    }

    public void emergencyBrake() {
        System.out.println("Tesla car has a emergency brake feature");


    }

    public void largeDisplay() {
        System.out.println("Tesla car has a large display feature");

    }

    public void autoPilot() {
        System.out.println("Tesla car has a auto pilot feature");

    }

    public void boostEngine() {
        System.out.println("Tesla car has a boost engine feature");

    }

    public void flyingCarFeature() {

    }
}
