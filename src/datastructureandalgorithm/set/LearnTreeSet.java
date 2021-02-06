package datastructureandalgorithm.set;

import java.util.TreeSet;

//No dublicate value; TreeSet is sorted either alphabetically or by integers

public class LearnTreeSet {
    public static void main(String[] args) {
        TreeSet<String> iPhoneModel = new TreeSet<>();
        iPhoneModel.add("12 Pro Max");
        iPhoneModel.add("12 Pro");
        iPhoneModel.add("12");
        iPhoneModel.add("9");
        iPhoneModel.add("11 Pro Max");
        iPhoneModel.add("11 Pro ");
        iPhoneModel.add("11");
        iPhoneModel.add("10");
        iPhoneModel.add("8");
        iPhoneModel.add("8 Pro");
        System.out.println(iPhoneModel);

        iPhoneModel.remove("11");
        System.out.println(iPhoneModel);
        //after pollFirst
        iPhoneModel.pollFirst();// first value will be removed
        System.out.println("After poll first:" + iPhoneModel);
        //after pollLast
        iPhoneModel.pollLast();
        System.out.println("After poll last:" + iPhoneModel);
        System.out.println(iPhoneModel.contains("9"));

    }
}
