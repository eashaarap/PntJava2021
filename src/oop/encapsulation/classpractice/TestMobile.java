package oop.encapsulation.classpractice;

public class TestMobile {

    public static void main(String[] args) {

        Mobile.Mobile("Samsung");

        Mobile myPhone = new Mobile();
        myPhone.setMobileColor("Blue");
        myPhone.setAvailable(true);
        myPhone.setMobileModel("10+ Edge");
        myPhone.setMobilePrice(1200);
        myPhone.setMobileMemory(64);

        System.out.println("My phone model is " + myPhone.getMobileModel());
        System.out.println("My phone color is " + myPhone.getMobileColor());
        System.out.println("My phone color is " + myPhone.getMobileColor());
        System.out.println("My phone is available " + myPhone.isAvailable());
        System.out.println("My phones memory is " + myPhone.getMobileMemory());
        System.out.println("My phones price is  " + myPhone.getMobilePrice());

    }
}
