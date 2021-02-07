package datastructureandalgorithm.array;

import java.util.Scanner;

public class LearnArray {

    //This is how you DECLARE VARIABLE and assign
    String name = "James";
    String address;


    //Array: which can hold multiple values of the same data type
    //Syntax: DataType [] variableName = new DataType[numberOfVariables]

    //This is how you DECLARE ARRAY with length
    static String [] students = new String [6]; //40byte x6 = 240 byte

    String [] addresses = new String [7];

    int [] stId ={ 101, 202, 303, 404, 505, 606, 707, 808, 909};


    public static void main(String[] args) {
        LearnArray.students[0]= "Jack";
        LearnArray.students[1]= "John";
        LearnArray.students[2]= "Bob";
        LearnArray.students[3]= "Yasmina";
        LearnArray.students[4]= "Bill";
        LearnArray.students[5]= "Trump";

        System.out.println("Student name "+ LearnArray.students[5]);


        LearnArray learn = new LearnArray();
        learn.addresses[0] = "NY";
        learn.addresses[1] = "NJ";
        learn.addresses[2] = "MI";
        learn.addresses[3] = "TX";
        learn.addresses[4] = "MI";
        learn.addresses[5] = "CA";
        learn.addresses[6] = "CO";
        System.out.println("Student Address is "+ learn.addresses[6]);

        System.out.println(learn.addresses[4]);
        try {  learn.addresses[7] = "FL";
            System.out.println(learn.addresses[7]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This is a Array Index Out of Bounds Exception, please use index 1-6");
        }

        int[] numbers = new int [10];
        numbers[0]=100;
        numbers[1]=102;
        numbers[2]=103;
        numbers[3]=104;
        numbers[4]=105;

        System.out.println("Numbers "+ numbers[3]);

        for (int i =0; i <numbers.length; i++){
            System.out.println("Numbers are "+ numbers[i]);
        }

        System.out.println("***********Student Name***************");
        for(int i =0; i <LearnArray.students.length; i++){
            System.out.println("students names are "+ LearnArray.students[i]);
        }

        /*
            For Each Loop:
                for( DataType variableName: arrayName){ }
         */
        System.out.println("***********For Each Loop*********");

        for(String st: learn.addresses){
            System.out.println("Student Address are "+ st);
        }


        System.out.println("***********Array Declare and  Assign***************");
        System.out.println(learn.stId[4]);

        double [] salary = {5000.5, 7000.5, 8000.4, 9000.5, 10002.5 };

        System.out.println(salary[2]);

        //How to retrieve all the values using for each loop
        for (double sa: salary){
            System.out.println("Salary is "+ sa);
        }

    }





}
