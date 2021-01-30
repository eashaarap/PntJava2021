package oop.abtraction;

public abstract class ModernCar {
    /*
        Abstract Class: not fully abstract;
            -allowed to declare method but must have body
            -allowed to declare method without body but must use Abstract keyword
            - can declare variable;
     */

    String modernCarBrand ="Audi";
    double modernCarSuggestedPrice = 75000;

    //Abstract Method
    public abstract void cameras();
    public abstract void autoLaneControl();
    public abstract void selfDriven();
    public abstract void gps();
    public abstract void autoPark();
    public abstract void emergencyBrake();
    public abstract void camera360();


    //static and non static methods are allowed here:
    public void remoteStart(){
        System.out.println("Modern Car has remote start feature ");
    }
    public static void dualClimateControl(){
        System.out.println("Modern Car has dual Climate Control feature");
    }

}
