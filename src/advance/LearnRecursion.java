package advance;

import static controlflow.LearnForLoop.tvDisplay;

public class LearnRecursion {
    /*
        Recursion: process in which a method calls itself continuously
            -must call itself
            -must have a base case
            -must change its state and move toward the base case
     */
    public static void main(String[] args) {
        LearnRecursion.pcDisplay();
    }

    static int count =0;
    public static void pcDisplay(){
        //count++;
        if(count <10){
            System.out.println("This is TV Display");
            pcDisplay();//when method calls itself its called Recursion
        }
    }
}
