package datastructureandalgorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    /*
        Queue: Interface; FIFO Order First In First Out; based on who is in line first

        in real life you will have a inventory and use that to create a queue
     */
    public static void main(String[] args) {
        Queue<String> name = new LinkedList<>();//using Queue Interface but constructor coming from LinkedList class
        name.add("Dalal");
        name.add("Gahania");
        name.add("Lamia");
        name.add("Nafiz");
        name.add("Farhana");

        for (String st : name) {
            System.out.println("Patient Name " + st);
        }

        System.out.println("***********After Remove*************");
        name.remove("Lamia");

        for (String st : name) {
            System.out.println("Patient Name " + st);
        }
        System.out.println("*********************************");

        System.out.println(name.element());//shows first element in the list in queue

        System.out.println("*************Poll Method********************");
        //Peek and Remove: Poll Method
        System.out.println(name.poll());// removes the first element in the queue i.e Dalal
        for (String st : name) {
            System.out.println("Patient Name " + st);
        }
        System.out.println("********Peek() Method*********");
        System.out.println(name.peek());//shows first element in the queue
        for (String st : name) {
            System.out.println("Patient Name " + st);
        }

        System.out.println("*******************************");
        System.out.println(name.remove());//removes first element in list
        System.out.println("*******************************");
        System.out.println(name.poll());

        //updated total list
        for (String st : name) {
            System.out.println("Patient Name " + st);
        }

    }
}
