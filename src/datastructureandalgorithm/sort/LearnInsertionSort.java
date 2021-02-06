package datastructureandalgorithm.sort;

import java.util.Arrays;

public class LearnInsertionSort {
    public static void main(String[] args) {
        //Insertion sort
        int [] number = { 3, 23, 4, 22, 102, 40, 60, 56, 78, 1, 9,23,3};
//        Arrays.sort(number, 0, 13);
//        System.out.println(Arrays.toString(number));

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
