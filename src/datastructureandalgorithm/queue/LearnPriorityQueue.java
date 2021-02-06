package datastructureandalgorithm.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    /*
        PriorityQueque is a class:
        Top Element from priority Queue: peek method only peek value value from Queue
            takes the value in order of alphabets for String/ and 0-1 for Integers(ascending order)
     */
    public static void main(String[] args) {
        PriorityQueue<String> productList = new PriorityQueue<>();
        productList.add("T-shirt");
        productList.add("Shoes");
        productList.add("Pants");
        productList.add("Belts");
        productList.add("Suits");
        productList.add("Jackets");

        System.out.println(productList.peek());

        PriorityQueue<Integer> productID = new PriorityQueue<>();
        productID.add(201);
        productID.add(202);
        productID.add(203);
        productID.add(204);
        productID.add(205);
        productID.add(206);
        productID.add(207);
        productID.add(199);
        System.out.println(productID.peek());

        for(Integer prod: productID){
            System.out.println("Product is "+ prod);
        }

        //Peek() Retrieves but doesnt remove the head of the Queue
        System.out.println(productID.peek());
        System.out.println("************Using poll Method***********");

        //poll() Retrieve but  removes the head of the Queue
        System.out.println(productID.poll());

        for(Integer prod: productID){
            System.out.println("Product is "+ prod);
        }
    }
}
