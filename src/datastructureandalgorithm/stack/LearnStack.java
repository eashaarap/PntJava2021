package datastructureandalgorithm.stack;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {
    /*
        Stack: LIFO(Last in first out); pushing element on top of the stack using push() method
            Popping element from the top the stack using pop() method: pops and remove
            Looks at the object at the top of the stack without removing it from the stack: peek() method
     */
    public static void main(String[] args) {
        Stack<String> clothingList = new Stack<>();
        clothingList.push("Pant");//push() methods will add elements to stacks
        clothingList.push("Skirt");
        clothingList.push("Shorts");
        clothingList.push("Hats");
        clothingList.push("Shoes");
        clothingList.push("Heels");
        clothingList.push("Gloves");
        System.out.println(clothingList);
        System.out.println(clothingList.pop());//removes most recent value added in the stack
        System.out.println("After pop " + clothingList);

        System.out.println("*******************************");
        Stack<Integer> clothingID = new Stack<>();
        for(int i = 0; i<7; i++){
            clothingID.push(300 + i);
        }
        System.out.println(clothingID);
        //How to retrieve all the value and pop?
        Iterator it = clothingID.iterator();
        while(it.hasNext()){
            System.out.println("Pop value : "+clothingID.pop());
        }
        System.out.println(clothingID);

        //Retrieve all the value from stack:
        for(Integer cloth: clothingID){
            System.out.println("clothing id is " + cloth);
        }

        Stack<Integer> priceList = new Stack<>();
        priceList.push(299);
        priceList.push(300);
        priceList.push(399);
        priceList.push(400);
        priceList.push(499);
        priceList.push(500);
        priceList.push(599);
        priceList.push(600);
        System.out.println(priceList.empty());//boolean is it empty or not true or false

        LearnStack.stackSearch(priceList,500);// elements start from 1 not 0

    }

    public static void stackSearch (Stack<Integer> sta, int element){
        Integer position = sta.search(element);
        if(position == -1){
            System.out.println("element not found");
        } else {
            System.out.println("Element found at position " + position);
        }
    }

}

