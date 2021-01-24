package exceptionhandling;

public class LearnFinalFinallyFinalize {
    /*
        What is Final, Finally, Finalize:
            Garbage collection: Finalize
             Finalize: used to perform clean up processing just before object is garbage collected
             Final: key word that we use to declare variables that we can't reassign; constant variable

     */

    static final int number = 24;
    String name = "Farhana";
    public static void main(String[] args) {
        //number = 25; -- can't reassign variable because its final

        LearnFinalFinallyFinalize lf1 = new LearnFinalFinallyFinalize();
        lf1.doDivision(44,0);
        LearnFinalFinallyFinalize lf2 = new LearnFinalFinallyFinalize();
        lf2.name= "Kate";
        LearnFinalFinallyFinalize lf3 = new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf4 = new LearnFinalFinallyFinalize();
        LearnFinalFinallyFinalize lf5 = new LearnFinalFinallyFinalize();

        System.gc();
    }
    public int doDivision(int num1, int num2) {
        int result = 0;
        try {// any line of code that may throw an exception
            result = num1 / num2;
            System.out.println("Division value is: " + result);

        } catch (Exception exception) {
            // exception.printStackTrace();
            System.out.println("This is arithmetic exception: Please use value greater than 0");
        } finally{// code executes regardless in this block
            System.out.println("hello");
            int total = num1 + num2;
            System.out.println("Total value " + total);
        }
        return result;
    }
}

