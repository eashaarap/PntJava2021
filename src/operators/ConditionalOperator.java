package operators;

public class ConditionalOperator {

    //&& = Conditional AND: all conditions have to be true to be executed
    // || = Conditional OR: one or other condition have to be true to be executed

    // Pipe ||

    public static void main(String[] args) {
        int num1 = 90;
        int num2 = 10;

    // if block
        if(num1 == num2){
            // if condition is false it will not execute block of code
            System.out.println("Number1 is bigger than Number2");
        }
        if(num1 == 55 && num2 == 60){
            System.out.println("Number1 and Number2 are equal");
        }
        if(num1 == 90 || num2 == 100){
            System.out.println("Number1 is bigger than Number2");
        }
    }





}
