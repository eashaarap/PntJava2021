package datastructureandalgorithm.arrayList;

import java.util.ArrayList;

public class LearnArrayList {

    /*
        ArrayList:
            No need to declare Array size/ Dynamic Way
           Arraylist<DataType> arraylistName = new ArrayList<>();
     */

    //ArrayList type:
    ArrayList<String> studentAddress = new ArrayList<>();

    public static ArrayList <Integer> studentMobileNumber=new ArrayList<Integer>();

    public static void main(String[] args) {

        LearnArrayList learn = new LearnArrayList();
        learn.studentAddress.add("Manhattan, NY");
        learn.studentAddress.add("Queens, NY");
        learn.studentAddress.add("Jamaica, NY");
        learn.studentAddress.add("Albany, NY");
        learn.studentAddress.add("Bronx, NY");
        learn.studentAddress.add("Queens, NY");

        System.out.println(learn.studentAddress.get(2));
        System.out.println(learn.studentAddress.size());

        //How to Retrieve all the value from ArrayList
        for(String st: learn.studentAddress){
            System.out.println("Student Address "+ st);
        }

        System.out.println("***********After Remove**********");
        learn.studentAddress.remove("Albany, NY");
        for(String st: learn.studentAddress){
            System.out.println("Student Address after remove  "+ st);
        }
        System.out.println("***********After Adding**********");
        learn.studentAddress.add("Random, NY");
        learn.studentAddress.add("Albany, NY");
        for(String st: learn.studentAddress){
            System.out.println("Student Address after add  "+ st);
        }
        System.out.println("******************************************");
        ArrayList<String>names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Zima");
        names.add("Easha");
        names.add("Dim");
        names.add("Monkey");
        for(String nm: names){
            System.out.print("The names in this list are: \n");
            System.out.println(nm);
        }

        String [] stName = new String[5000];
        stName[0]="James";
        stName[1]="Jack";
        stName[2]="Jim";
        stName[3]="Jacob";

        //Wrapper Class:
        //Integer: int
        //Byte: byte
        //Short: short
        //Double: double
        //Boolean: boolean


    }

}
