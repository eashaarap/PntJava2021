package datastructureandalgorithm.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StateList {
    public static void main(String[] args) {
        List<String> stateNameList=new ArrayList<>();
        List<String> stateNameList1=new LinkedList<>();
        stateNameList.add("NY");
        stateNameList.add("NJ");
        stateNameList.add("AL");
        stateNameList.add("NV");
        stateNameList.add("CO");
        stateNameList.add("MD");
        stateNameList.add("HI");
        stateNameList.add("CA");

        //How to retrieve all the value
//        for(String st: stateNameList){
//            System.out.println("State names are "+ st);
//        }

        System.out.println("**********Before Remove*********");
        Iterator it = stateNameList.iterator();
        while(it.hasNext()){//it(reference variable) has a method built in .hasNext() which has return type boolean
            System.out.println(it.next());
        }
        System.out.println("**********After Remove**********");
        stateNameList.remove("AL");
        stateNameList.remove("CA");
        Iterator ite = stateNameList.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }

}
