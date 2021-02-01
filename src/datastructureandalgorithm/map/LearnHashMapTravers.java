package datastructureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMapTravers {

    /*
        Key Points:
            For Operation like add, remove, containsKey, time complexity is 0
            TreeMap always keeps elements in sorted (increasing) order,
             while the elements in HashMap have no order
     */

    public static void main(String[] args) {
        int[] numbers = { 23, 45, 9, 45, 78, 2, 34, 201, 88, 66, 32, 9, 2, 402, 3, 299, 605, 2};
        LearnHashMapTravers.printFrequency(numbers);

    }
    public static void printFrequency(int [] num){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i <num.length; i++){
            Integer count = hmap.get(num[i]);
            if(hmap.get(num[i]) == null){
                hmap.put(num[i],1);
            }else{
                hmap.put(num[i],++count);
            }
        }
        for(Map.Entry mp: hmap.entrySet()){
            System.out.println("Frequency of " + mp.getKey()+ " : " + mp.getValue());
        }
    }
}
