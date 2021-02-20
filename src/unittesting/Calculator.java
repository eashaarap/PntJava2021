package unittesting;

public class Calculator {

    /**
     * To do the summation of two number
     * @param number1
     * @param number2
     * @return
     * Author: Easha
     */

    public static int doSum (int number1, int number2){
        int num1 = number1;
        int num2 = number2;
        int total = num1 + num2;
        System.out.println("Total Value: "+ total);
        return total;
    }

    /**
     *
     * @param number1
     * @param number2
     * @return
     */
    public static int doSub(int number1, int number2){
        int num1 = number1;
        int num2 = number2;
        System.out.println("Subtraction value is: "+ (num1 - num2));
        return num1 - num2;

    }

    /**
     * To do Multiplication
     * @param number1
     * @param number2
     * @return
     */
    public static double doMultiply(double number1, double number2){
        return number1 * number2;
    }


}
