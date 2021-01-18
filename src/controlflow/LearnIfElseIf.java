package controlflow;

import java.util.Scanner;

public class LearnIfElseIf {
    // Else if means another If or adding more condition

    public static void main(String[] args) {

      LearnIfElseIf.retirementCalculator();
      LearnIfElse.retirementCalculator1();



    }


    public static void retirementCalculator(){
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
