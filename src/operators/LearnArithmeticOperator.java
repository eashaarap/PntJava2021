package operators;

public class LearnArithmeticOperator {

    /*
        + Additive Operator
        - Subtraction Operator
        * Multiplication Operator
        / Division Operator
        % Remainder : 40/3 = 13
     */
    public static void main(String[] args) {
        int num1 =40;
        int num2 = 3;
        int total = num1 + num2;
        int balance = num1 = num2;
        int monthlyValue = num1 * num2;
        int weeklyValue = num1 / num2;
        int value = num1 & num2;

        System.out.println("Total: " + total);
        System.out.println("Balance: " + balance);
        System.out.println("monthlyValue: "+ monthlyValue);
        System.out.println("weeklyValue: "+ weeklyValue);
        System.out.println("value: " + value);

    }




}
