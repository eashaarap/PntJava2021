package datastructureandalgorithm.sort;

public class LearnSwap {
    public static void main(String[] args) {
        int num1=45;
        int num2= 55;
        int temp;
        System.out.println("Number1 value is " + num1);
        System.out.println("Number2 value is " + num2);

        temp =num1;
        num2=temp;
        num1=temp+num2;
        temp=num1;
        System.out.println(temp);
    }
}
