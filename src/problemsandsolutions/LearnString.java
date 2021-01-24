package problemsandsolutions;

import java.util.Locale;

public class LearnString {

    /*
     String: Data Type; A Class; A sequence of Characters
     */

    String name = "James";

    public static void main(String[] args) {
        String food = "couscous";
        System.out.println(food.length());
        System.out.println(food.equals("Couscous"));
        System.out.println(food.equalsIgnoreCase("cousCous"));
        System.out.println(food.charAt(5));
        char charCompare = (food.charAt(5));
        String name = "James";
        System.out.println(food.substring(3, 7));
        System.out.println(food.toLowerCase(Locale.ROOT));
        System.out.println(food.toUpperCase(Locale.ROOT));

        String stId = "101";
        String lName = "William";

        System.out.println(stId.concat(lName));

        //Exception Handling
        try{
            System.out.println(food.charAt(10));
        } catch (Exception e) {
            System.out.println("This is a String Index Out Of Bounds Exception");
        }
        /*
            Reverse String
            Remove
            Trim
         */
        System.out.println(food.contains("p"));// checks if p is included in our string




    }
}
