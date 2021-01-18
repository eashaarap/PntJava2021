package controlflow;

public class LearnForLoop {

    // Loop is allowing us to Execute a statement or group of statements multiple times.

    // For Loop : will execute until condition is true, if not true then it will exit from loop
    // While Loop
    // Do..While loop
    // For Each Loop


    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");


        // For Loop
        // for(Initialization; Condition;Iteration){ }
        // Initialization=StartPoint; Condition=EndPoint; Iteration=Looping/AgainNAgain
        for (int i = 7; i <= 9; i++) {
            System.out.println("Hello");
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Hello world");
        }

//
//        for (int i = 7; i > 5 && i <=12; i++) {
//            System.out.println("Hello");
//        }
//
//        // Bad Coding/ Virus/ Infinite Loop
//        for (int i = 7; i > 9; i++) {
//            System.out.println("Hello");
//        }



        for (int i= 0; i<=10; i++){
            System.out.println("We are learning For Loop "+i);
        }

        System.out.println("*********************************************");
        for (int i=0; i<5; i++){
            System.out.println("QA Engineer");
            int num1= 45;
            int num2= 55;
            int total= num1+num2;
            System.out.println("Total is "+total);
            LearnSwitchCase.foodMenu(8);
        }
        System.out.println("************* Nested For Loop ********************************");

        for (int i=2; i<=8; i++){
            // Parent Loop
            System.out.println("We love to eat Pizza");

            for (int j= 5; j<=7; j++){
                // child Loop/ Nested Loop
                System.out.println("We also love to drink Coffee "+j);
            }
        }

        System.out.println("************* For Loop  Increment by 2 ********************************");
        for (int i =22; i<34;i=i+1){
            System.out.println("Increment by 2");
        }
        System.out.println("************* For Loop  Decrement by 2 ********************************");
        for (int i =42; i>34;i=i-2){
            System.out.println("Decrement by 2");
        }

        System.out.println("************* For Loop  Increment++ ********************************");
        for (int i =2; i<8;   i+=1){
            System.out.println("Increment++");
        }


        LearnForLoop.tvDisplay();
    }


    public static void tvDisplay(){

        for (int i=0; i<5; i++){
            System.out.println("Tv Display is 65 inch");
        }
    }


}
