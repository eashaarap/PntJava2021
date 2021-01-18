package controlflow;

public class LearnWhileLoop {

    // While loop is used in situations where we do not know how many times loop needs to be executed beforehand.
    // For loop is used where we already know about the number of times loop needs to be executed.
    // Typically for a index used in iteration.

    // While Loop: pre condition check
    // while(condition){ ++ or -- }

    public static void main(String[] args) {
        int age=24;
        while (age>21){
            System.out.println("Your age is Grater than 21");
            age--;
            //break;
            // Exit from loop when condition is false
        }

        System.out.println("*************** Nested While Loop *************");
        int number=24;
        while (number>21){
            System.out.println("Your Age is Grater than 21");
            number--;
            // Nested WhileLoop
            int qty= 30;
            while (qty<35){
                System.out.println("We are Ordering Pizza");
                qty++;
            }


        }
        System.out.println("*************** While Loop Another Example *************");
        int newAge=25;
        while (newAge >21 ){
            System.out.println("Hello");
            String gender="Male";
            if (gender=="Female"){
                System.out.println("Female are not allowed in here");
                break;
            } else {
                System.out.println("Male are allowed in here");
            }
            newAge--;

        }



    }









}
