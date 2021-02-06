package datastructureandalgorithm.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
    Union: combines sets except duplicate values( all values only once)
    Intersection: shows common values from each set
    Difference: comparing first set to the second set and shows the difference of what that set has

 */

public class LearnUnionIntersectionDifference {
    public static void main(String[] args) {
        int num1[]={1,3,4,5,6,8,34,2,77,56,78};
        int num2[]={9,4,5,7,8,1,12,15,77,34,44,102,502,304};

        //to convert array to set:
        Set<Integer> number1 = new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[]{1,3,4,5,6,8,34,2,77,56,78}));
        Set<Integer> number2 = new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{9,4,5,7,8,1,12,15,77,34,44,102,502,304}));

        //to do union set: combining the two
        Set<Integer> union = new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of two set " + union);

        //to do Intersection
        Set<Integer> intersection = new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("Intersection of two set " + intersection);

        // to do Symmetric Difference
        Set<Integer> difference = new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println("Difference of two set " + difference);
    }
}
