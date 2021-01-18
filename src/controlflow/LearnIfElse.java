package controlflow;

import java.util.Scanner;

public class LearnIfElse {

    // control flow: Make some decision

    // if(condition){ }
    // if condition is true then it will execute if block and
    // if condition is false it will execute else block

    // Eclipse:ctrl+shift+f = format code
    // Intellij IDEA: ctrl+alt+L = format code in windows
    // Intellij IDEA: command+opt+L = format code in Mac


    public static void main(String[] args) {

        int number = 32;

        if (number == 24) {
            System.out.println("Number is 24");
        } else {
            System.out.println("Number is not 24");
        }

        int age = 56;
        if (age >= 18 && age <= 21) {
            System.out.println("You are Adult but you can not buy Cigarette");
        } else {
            System.out.println("You are not Adult");
        }

        String gender = "female";
        if (gender == "female" || age >= 50 && number == 32) {
            System.out.println("You do not have to buy ticket");
        } else {
            System.out.println("You do have to buy ticket");
        }

        if (gender == "male" || age >= 50 && number == 32) {
            System.out.println("Male do not have to buy ticket");
        } else {
            System.out.println("Male have to buy ticket");
        }

        if (age >= 56 && gender =="Female" && number == 32){
            System.out.println("Happy");
        } else{
            System.out.println("Zima");
        }



    }

    public static void retirementCalculator1(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your Age please");
        int age= input.nextInt();
        if (age <= 24 && age <= 40){
            System.out.println("Your age is more/less than 24");
        } else if ( age >= 40 && age <=50){
            System.out.println("Your age is more than 40");
        } else if (age >=50 && age <=60){
            System.out.println("Your age is more than 50");
        } else if (age>=60 && age <=65){
            System.out.println("Your age is more than 60");
        } else {
            System.out.println("Its your Retirement Time");
        }
    }


}
