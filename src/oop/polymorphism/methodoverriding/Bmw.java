package oop.polymorphism.methodoverriding;

import oop.abtraction.ModernCar;

/*
    Method Overriding: inheriting methods from parent class and changing the body ONLY
    @Override ---- Override annotation
 */

public class Bmw extends ModernCar {


    @Override
    public void cameras() {

    }

    @Override
    public void autoLaneControl() {

    }

    @Override
    public void selfDriven() {

    }

    @Override
    public void gps() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void emergencyBrake() {

    }

    @Override
    public void camera360() {

    }

    //overloaded: because you are changing parameter
    public void camera360(String name) {

    }

    @Override
    public void remoteStart(){
        System.out.println("BMW Car has Remote Start Feature");
    }
}
