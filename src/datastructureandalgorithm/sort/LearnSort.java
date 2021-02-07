package datastructureandalgorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LearnSort {
    /*
       Sorting: organize data; adding values at any position you want
            -Insertion Sort:
            -Bubble sort:
            -Heap Sort:
            -Quick Sort
            - Merge Sort:
     */
    public static void main(String[] args) {
        int [] numbers = {34, 2, 55, 6, 7, 1, 20, 203, 333};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        LearnSort.collectionSort();

    }

    public static void collectionSort(){
        ArrayList<String> al = new ArrayList<>();
        al.add("Deer");
        al.add("Rabbit");
        al.add("Cat");
        al.add("Dog");
        al.add("Snake");

        Collections.sort(al);

        System.out.println("List after using Collection Sort " + al);
    }
}

