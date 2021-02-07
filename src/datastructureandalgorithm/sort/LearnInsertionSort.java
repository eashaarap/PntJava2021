package datastructureandalgorithm.sort;

import java.util.Arrays;
import java.util.Collections;

public class LearnInsertionSort {
    public static void main(String[] args) {
        //Insertion sort
        Integer [] number = { 3, 23, 4, 22, 102, 40, 60, 56, 78, 1, 9,23,3};

        //sort number in ascending order
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        //sort number in descending order
          Arrays.sort(number, Collections.reverseOrder());
        System.out.println(Arrays.toString(number));



        //output:
        for(int i = 0; i < number.length; i++){
            int j =i-1;//-1
            int point = number[i];//3 because i =0 so thats our first index
            while (j>= 0 && number[j]>point){//is j(-1) greater or equal to 0 and
                number[j+1]=number[j];
                j=j-1;
            }
            number[j+1]=point;
        }
        for(int n =0; n<number.length; n++){
            System.out.println(number[n]+ " ");
        }
    }
}
