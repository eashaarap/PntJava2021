package method;

public class LearnMethod {

    /*
       Method: block of code which runs when it is calls;
                -It is uses to perform certain actions
                TYPE:
                    Return Method without Parameter:
                    Return Method with Parameter:
                    Non return Method without Parameter:
                    Non return Method with Parameter:
                NAME: verb+Noun
                SYNTAX: AccessModifier ReturnType/MethodType MethodName(){ Method Body};
                RETURN TYPES: All Data type, void, class, and object
     */

    //Method
    public static void checkDisplay(){
        System.out.println("Method");
    }

    //Return Type Method
    public int doSummation(){
        int num1 = 50;
        int num2 = 60;
        int total = num1 + num2;
        System.out.println("Total Value: "+ total);
        return total;

    }

    //Return type Dynamic/ Parameterized

    public int doSum (int number1, int number2){
        int num1 = number1;
        int num2 = number2;
        int total = num1 + num2;
        System.out.println("Total Value: "+ total);
        return total;
    }


    //Dynamic method:
    public int doSub(int number1, int number2){
        int num1 = number1;
        int num2 = number2;
        System.out.println("Subtraction value is: "+ (num1 - num2));
        return num1 - num2;

    }

    public int doSubtraction(int number1, int number2){
        System.out.println("Subtraction value is: "+ (number1 - number2));
        return number1 - number2;

    }

    public double doMultiply(double number1, double number2){
        return number1 * number2;
    }

    //Non Return Method without Parameter:
    public void studentInformation(){
        String name = "James";
        String address = "Queens,NY";
        System.out.println("The Students name is: " + name + " Student Address is: "+ address);
    }

    //Non Return Method without Parameter:
    public void salaryCalculation(){
        int month= 12;
        double salary = 4500.50;
        double yearlySalary = month * salary;
        System.out.println("Yearly salary is: " + yearlySalary);
    }

    //Non Return Method with Parameter
    public void doDivision(double num1, double num2){
        double result = num1/num2;
        System.out.println("Division result is: " + result);
    }

    public static void stInfo(String name, String address, String phoneNumber){
        System.out.println("Student name is: " + name + "Student addrses is: "+ address + "Student Address is: "+ address + "Student phone number is: "+ phoneNumber);
    }

    public static void main(String[] args) {

        LearnMethod.checkDisplay();

        LearnMethod learn = new LearnMethod();
        learn.doSummation();

        int salary = 4000;
        double totalSalary = salary + learn.doSummation();//how we use return
        System.out.println(totalSalary);

        learn.doSub(340,40);
        learn.doSum(200, 36);
        learn.doSubtraction(400, 20);
        learn.doMultiply(30, 25);
        System.out.println(learn.doMultiply(30.00, 25.00));
        learn.studentInformation();
        learn.salaryCalculation();
        learn.doDivision(300,23);

        LearnMethod.stInfo("Maria", "Albany,NY","7183349287");

    }










}
