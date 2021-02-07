package oop.polymorphism.methodoverloading;

public class Calculator {
    /*
        Method Overloading: you are able to use the same method repeatedly however must have
        DIFFERENT parameterized DATA TYPE PATTERN i.e as many methods as you want

     */
    public static void main(String[] args) {
        Calculator.doSum(30,20);
        Calculator.doSum(10,22,15);
        Calculator.stInfo(50,"Vinhth");

        Calculator.aboutMe("Easha",5183449274L);
        Calculator.aboutMe("Pizza", 21, 5200);

        System.gc();

    }

    public static void doSum(int num1, int num2){
        int total = num1+num2;
        System.out.println("Total is "+ total);
    }
    public static void doSum(int num1, int num2, int num3){
        int total = num1+num2+num3;
        System.out.println("Total is "+ total);
    }
    public static void doSum(int num1, int num2, int num3, int num4){
        int total = num1+num2+ num3+ num4;
        System.out.println("Total is "+ total);
    }

    public static void stInfo (String name){
        System.out.println("Student name is "+ name);
    }
    public static void stInfo (int age, String name){
        System.out.println("Student name is "+ age + " & age is " + name);

    }

    private static String aboutMe(String myName, long myNumber){
        System.out.println("My name is "+ myName + " and my phone number is "+ myNumber);
        return myName;
    }
    private static String aboutMe(String myFavFood, int myAge, int myAddress){
        System.out.println("My favorite food is "+ myFavFood + " and my age is " + myAge + " and house number is "+ myAddress);
        return myFavFood;
    }
}
