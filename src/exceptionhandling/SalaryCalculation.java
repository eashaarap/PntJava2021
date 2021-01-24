package exceptionhandling;

public class SalaryCalculation {
    int div;

    public static void main(String[] args) throws Exception {
        SalaryCalculation.doDivision(20, 99);
        SalaryCalculation calculator = new SalaryCalculation();
        try {
            calculator.doDivision1(23, 0);
        }catch (Exception e){
            System.out.println("This is Arithmetic Exception");
        }
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

    public int doDivision1(int num1, int num2)throws Exception{
        this.div = num1/num2;
        System.out.println("Division value is " + div);
        return div;

    }

}