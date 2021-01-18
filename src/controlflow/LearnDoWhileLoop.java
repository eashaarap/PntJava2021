package controlflow;

public class LearnDoWhileLoop {

    // Post condition check:

    // Do while loop execute at least one time then it will check condition.
    // do{} while(condition)

    public static void main(String[] args) {
        // First it will execute one time then it will check condition
        int num=26;
        do {
            // do block: Execute this block
            System.out.println("We are Learning DO while Loop");
            num--;
        } while (num>20);


        int number=6;
        do {
            // do block: Execute this block
            System.out.println("Learning DO while Loop");
            number++;
        } while (number<30);
    }

}
