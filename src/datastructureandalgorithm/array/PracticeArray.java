package datastructureandalgorithm.array;

import java.util.Scanner;

public class PracticeArray {

    public static void main(String[] args) {
//        PracticeArray doArray = new PracticeArray();
//        doArray.ages[0]= 22;
//        doArray.ages[1]= 32;
//        doArray.ages[2]= 42;
//        doArray.ages[3]= 52;
//        doArray.ages[4]= 62;
//        doArray.ages[5]= 72;
//        doArray.ages[6]= 82;
//        doArray.ages[7]= 92;
//        System.out.println("The age is " + doArray.ages[7]);
//        for(int ay: doArray.ages){
//            System.out.println("here you can see all the ages of the array "+ ay);
//        }
//
//        PracticeArray.names[0]="Tina";
//        PracticeArray.names[1]="Jim";
//        PracticeArray.names[2]="Nia";
//        PracticeArray.names[3]="Nina";
//        PracticeArray.names[4]="Sam";
//        PracticeArray.names[5]="Adam";
//        PracticeArray.names[6]="Marly";
//        PracticeArray.names[7]="Will";
//        PracticeArray.names[8]="James";
//        PracticeArray.names[9]="Heather";
//        PracticeArray.names[10]="Rio";
//
//        System.out.println("The name is " + PracticeArray.names[3]);
//        for(String nm: names){
//            System.out.println("You can see all the names of the array "+ nm);
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("I want to know your favorite colors");
        System.out.println("How many favorite colors do you have?");
        int numArr = input.nextInt();
        String[] colors = new String[numArr];

            for (int i = 0; i < numArr; i++) {

                System.out.println("Enter the  " + (i + 1) + " color :");
                colors[i] = input.next();
            }

            System.out.println("Your favorite colors are:");

            for (String allColors : colors) {
                System.out.println(allColors);
            }

    }

        static String [] names = new String[11];
        int ages [] = new int[8];

}
