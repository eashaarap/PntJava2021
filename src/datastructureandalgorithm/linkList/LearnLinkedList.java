package datastructureandalgorithm.linkList;

import java.util.LinkedList;

public class LearnLinkedList {
    /*
        Manipulation with LinkedList is faster than ArrayList
     */

    LinkedList <String> stFatherName = new LinkedList<>();
    LinkedList<String>pizzaList = new LinkedList<>();

    public void getPizzaList(){
        pizzaList.add("Cheese");
        pizzaList.add("Jalapeno");
        pizzaList.add("Mushroom");
        pizzaList.add("Pepperoni");
        pizzaList.add("Shrimp");
        for(String pz: pizzaList){
            System.out.println("Pizza Names are "+ pz);
        }
    }

    public static void main(String[] args) {
        LearnLinkedList learn = new LearnLinkedList();
        learn.stFatherName.add("Donald");
        learn.stFatherName.add("William");
        learn.stFatherName.add("Akbar");
        learn.stFatherName.add("Shah");

        //retrieve single value from list
        System.out.println(learn.stFatherName.get(2));

        //retrieve all value from list
        for(String st: learn.stFatherName){
            System.out.println("Father's Names are "+ st);
        }

        //call method
        learn.getPizzaList();


    }













}
