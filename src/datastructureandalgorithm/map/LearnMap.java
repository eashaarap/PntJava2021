package datastructureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    /*
        MAP: <key, value>
             to add inside MAPs we use .put() instead of .add()
     */

    String name = "James";

    public static void main(String[] args) {
        HashMap<String,String> stateMap= new HashMap<>();
        stateMap.put("USA", "NEW YORK");
        stateMap.put("CANADA", "ONTARIO");
        stateMap.put("ARMENIA", "YEREVAN");
        stateMap.put("NEPAL", "KTM");
        stateMap.put("TURKEY", "BATMAN");
        stateMap.put("BANGLADESH", "DHAKA");
        stateMap.put("TOKYO", "JAPAN");

        System.out.println(stateMap.get("NEPAL"));

        //How to retrieve all the values from the map

        for(Map.Entry<String, String>entry: stateMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("*******Another Approach**********");
        //Another approach to retrieve all
        for(String st: stateMap.keySet()){
            System.out.println(st+ " : "+ stateMap.get(st));
        }
        System.out.println("********For each w/ Lamda Approach**********");
        //easiest way to retrieve all
        stateMap.forEach((p,k ) -> System.out.println(p+" "+k) );
        // use our hashmap.forEach( (k,v )  -> sout (k + v)   )
        //k=key v = value "->" is a lambda
    }

}
