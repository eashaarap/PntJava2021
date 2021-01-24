package oop.abtraction;

public class Test {

        public static void main(String[] args) {
            GeneralMotors gm = new GeneralMotors();
            gm.startCar();
            gm.stopCar();
            System.out.println(gm.brand);
            Car.carDoor(2);

            Tesla tesla = new Tesla();
            tesla.startCar();
            tesla.accelerationCar();
            tesla.engineCar();


        }

}
