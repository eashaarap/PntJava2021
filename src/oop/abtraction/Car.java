package oop.abtraction;

public interface Car {
    /*
        Interface: guideline for future/ proto type design for your reference
        - so that development team can follow this to develop product
        - can't declare variable but we can declare and assign a value during creating variable
        -100% Abstract
        -can create another interface inside interface
        -cant create method with method BODY but can declare method without body
        - to declare method w/ return and body, must be static
        - all properties assigned is final in interface

     */

    String carName = "Toyota";
    static String price = " 23000";

    //Variable
    String brand = "Mercedes";
    int carQuantity = 200;
    String seat = "2";
    String headLight ="4";
    boolean gasTank = true;

    //Abstract Method
    public void startCar();
    public void stopCar();
    public void wheelCar();
    public void engineCar();
    public void accelerationCar();
    public void steeringCar();
    public void brakeCar();
    public void navigationCar();

    public void carDisplay();
    public static int carDoor(int doorNumber){
        int totalDoor = 1*doorNumber;
        System.out.println("Total door " + totalDoor);
        return totalDoor;

    }

    public interface newCar{
        public void carRoof();

    }

}
