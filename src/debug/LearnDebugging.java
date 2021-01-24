package debug;

import java.util.Scanner;

public class LearnDebugging {
    /*
     Bug/ Error/ Defect
       Debugging: Identify logical error by yourself
       Breakpoint:
       Debug
       QA/QE/Software Testing
     */

    public static void main(String[] args) {
//        int num1 = 20;
//        int num2 =30;
//        int num3 =33;
//        int num4 =43;
//        int num5 =53;
//        int sum = num1 +num2;
//        System.out.println("Total is " + sum);
        LearnDebugging.doPattern();
    }
    public static void doPattern(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your number");
            int rowNumber = input.nextInt();

            for (int i =1; i<=rowNumber; i++){
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

        }
}
