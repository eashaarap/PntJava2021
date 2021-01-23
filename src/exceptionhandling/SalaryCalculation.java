package exceptionhandling;

public class SalaryCalculation {

    public static void main(String[] args) {
        SalaryCalculation.doDivision(20, 99);
    }

    public static int doDivision(int num1, int num2) {
        int result = 0;
        try {
            result = num1 / num2;
            System.out.println("Division value is: " + result);

        } catch (Exception exception) {
           // exception.printStackTrace();
            System.out.println("This is arithmetic exception: Please use value greater than 0");
        }
        return result;
    }

}