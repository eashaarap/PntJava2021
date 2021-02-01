package datastructureandalgorithm.map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {
    public static void main(String[] args) {

        List<String> stateNameOfUSA = new LinkedList<>();
        stateNameOfUSA.add("NY");
        stateNameOfUSA.add("OH");
        stateNameOfUSA.add("CA");
        stateNameOfUSA.add("NJ");
        stateNameOfUSA.add("WY");
        stateNameOfUSA.add("TX");
        stateNameOfUSA.add("FL");
        stateNameOfUSA.add("IN");

        List<String> stateNameOfCANADA = new LinkedList<>();
        stateNameOfCANADA.add("Ottawa");
        stateNameOfCANADA.add("Vancouver");
        stateNameOfCANADA.add("Montreal");
        stateNameOfCANADA.add("Toronto");
        stateNameOfCANADA.add("Victoria");
        stateNameOfCANADA.add("Quebec");
        stateNameOfCANADA.add("Winnipeg");

        Map<String,List<String>> stMap = new HashMap<>();
            stMap.put("USA", stateNameOfUSA);
            stMap.put("CANADA", stateNameOfCANADA);

            for(Map.Entry<String, List<String>> st: stMap.entrySet()){
                System.out.println(st.getKey() + " : "+ st.getValue());
            }
    }




}
