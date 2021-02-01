package datastructureandalgorithm.array;

public class Learn3DArray {

    /*
        3D Array = 1D + 2D Array
        Syntax:
        DataType [Size][Row][Column] arrayName = new DataType[Size][Row][Column];
     */


    //Declare 3D Array:
    static String[][][] pizza = new String[2][5][5];
    static String pizza1 [][][] = new String[2][6][5];

    public static void main(String[] args) {

        //assign value
        Learn3DArray.pizza[0][0][0]="sl";
        Learn3DArray.pizza[0][0][1]="Pizza Type";
        Learn3DArray.pizza[0][0][2]="Price";
        Learn3DArray.pizza[0][0][3]="Quantity";
        Learn3DArray.pizza[0][0][4]="Amount";

        Learn3DArray.pizza[0][1][0]="101";
        Learn3DArray.pizza[0][1][1]="Pepperoni";
        Learn3DArray.pizza[0][1][2]="35";
        Learn3DArray.pizza[0][1][3]="5";
        Learn3DArray.pizza[0][1][4]="165";

        Learn3DArray.pizza[0][2][0]="102";
        Learn3DArray.pizza[0][2][1]="Napolitan Pizza";
        Learn3DArray.pizza[0][2][2]="20";
        Learn3DArray.pizza[0][2][3]="2";
        Learn3DArray.pizza[0][2][4]="90";

        Learn3DArray.pizza[0][3][0]="103";
        Learn3DArray.pizza[0][3][1]="meat lover pizza";
        Learn3DArray.pizza[0][3][2]="55";
        Learn3DArray.pizza[0][3][3]="3";
        Learn3DArray.pizza[0][3][4]="165";

        Learn3DArray.pizza[0][4][0]="104";
        Learn3DArray.pizza[0][4][1]="Shrimp Pizza";
        Learn3DArray.pizza[0][4][2]="56";
        Learn3DArray.pizza[0][4][3]="5";
        Learn3DArray.pizza[0][4][4]="300";

        //System.out.println("Pizza Info "+ Learn3DArray.pizza[0][4][1]);

        for(String pizz [][]: pizza){
            //Convert 3D to 2D
            //Convert 2D to 1D
            //Get value from 1D
            for(String []piz: pizz){
                for(String pi: piz){
                    System.out.print( pi+ "   ");
                }
                System.out.println();
            }
        }

    }
}
