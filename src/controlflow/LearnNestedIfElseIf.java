package controlflow;

public class LearnNestedIfElseIf {


    // Nested if else: child if else
    public static void main(String[] args) {

        int score =99;
        if (score >= 90){
            System.out.println("You got A+");
            if (score >= 92 && score<=94){
                System.out.println("You are Excellent");
            } else if(score >= 95) {
                if (score >= 95 && score <=98){
                    System.out.println("You are Genius");
                } else {
                    System.out.println("You are outstanding");
                }
            }
        } else if (score >= 80){
            System.out.println("You got A-");
        }else if (score >= 70){
            System.out.println("You got A");
        }else if (score >= 60){
            System.out.println("You got B");
        } else if (score >= 50){
            System.out.println("You got C");
        } else {
            System.out.println("You got F");
        }



    }








}
