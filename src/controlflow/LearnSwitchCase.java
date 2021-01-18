package controlflow;

import java.util.Scanner;

public class LearnSwitchCase {

    // Switch Case

    public static void main(String[] args) {

       //LearnSwitchCase.foodMenu();
       LearnSwitchCase.foodMenu(7);


//       String name="James";
//       switch (name){
//           case "James":
//
//       }

    }

    public static void foodMenu(int foodSerial){
        //Scanner input= new Scanner(System.in);
        //System.out.println("Enter your food Serial");
        //int foodSerial = input.nextInt();
        String foodName;
        switch (foodSerial) {
            case 1:
                foodName = "Pizza";
                break;
            case 2:
                foodName = "Couscous";
                break;
            case 3:
                foodName = "Nuts";
                break;
            case 4:
                foodName = "Biriyani";
                break;
            case 5:
                foodName = "Momo";
                break;
            case 6:
                foodName = "Burger";
                break;
            case 7:
                foodName = "Ramen";
                break;
            case 8:
                foodName = "Shish Kabab";
                break;
            case 9:
                foodName = "Aghrum";
                break;
            case 10:
                foodName = "Sharma";
                break;
            case 11:
                foodName = "Coffee";
                String coffeeType="Espresso";
                if (coffeeType == "Espresso"){
                    System.out.println("You selected Espresso Coffee");
                } else if (coffeeType == "Ethiopian") {
                    System.out.println("You selected Ethiopian Coffee");
                } else {
                    System.out.println("Did not select any Type");
                }
                break;
            default:
                foodName= "Invalid Food Item selected";
                break;
        }
        System.out.println("Selected food is "+foodName);

    }


}
