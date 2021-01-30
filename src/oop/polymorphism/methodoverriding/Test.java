package oop.polymorphism.methodoverriding;

import oop.abtraction.Car;
import oop.abtraction.GeneralMotors;

public class Test {

    public static void main(String[] args) {

        Bmw bmw = new Bmw();
        bmw.remoteStart();

        Audi audi = new Audi();
        audi.remoteStart();

        //How to create object?
        //ClassName obj name = new constructorOfClass();
        GeneralMotors gm = new GeneralMotors();
        gm.startCar();
        // how to create object from interfaces:
            // but you cannot get all the properties of GeneralMotors interface,
        // you only get those you implemented from Car interface and overrided
        // Accessibility depends on the className not the constructor of the class*** our ex: Car Interface
        Car myCar = new GeneralMotors();
        myCar.stopCar();
        //myCar.carInfo();// this is red because carInfo is a method only for GeneralMotors interface, not Car interface
        ((GeneralMotors) myCar).carInfo();//but you can cast like this to call that method within GeneralMotors





    }

}
