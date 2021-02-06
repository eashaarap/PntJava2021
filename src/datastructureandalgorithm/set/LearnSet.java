package datastructureandalgorithm.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    /*
        Set is an interface which extends collection. It is an un order collection of objects in which
        duplicate values cant be stored so cant have duplicate values

        Set is implemented by Hashset, LinkedHashset, or UseTreeSet
            Set is a parent interface of all set classes; no duplicate values are allowed;
        Hashsets: not sorted/ordered. Faster than a TreeSet
     */
    public static void main(String[] args) {
        Set<String> mobileBrand = new HashSet<>();
        mobileBrand.add("Samsung");
        mobileBrand.add("IPhone");
        mobileBrand.add("LG");
        mobileBrand.add("Nokia");
        mobileBrand.add("Google");
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.remove("Nokia"));//boolean value
        System.out.println("After remove " + mobileBrand);
        System.out.println(mobileBrand.contains("Samsung"));//boolean value
    }
}
