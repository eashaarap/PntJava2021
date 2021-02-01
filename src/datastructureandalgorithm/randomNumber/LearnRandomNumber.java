package datastructureandalgorithm.randomNumber;

import java.util.Random;

public class LearnRandomNumber {

    public static void main(String[] args) {

       int [] stId = new int [10];
        Random random = new Random();
        random.setSeed(20);
        for(int i =0; i < stId.length; i++){
            stId[i] = random.nextInt(400);
            System.out.println(stId[i]);
        }


    }
}
