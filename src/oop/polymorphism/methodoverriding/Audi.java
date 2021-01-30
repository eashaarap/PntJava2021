package oop.polymorphism.methodoverriding;

public class Audi extends Bmw{

    @Override
    public void remoteStart(){
        System.out.println("Audi car has remote start feature");
    }

}
