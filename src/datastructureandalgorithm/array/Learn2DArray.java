package datastructureandalgorithm.array;

public class Learn2DArray {

    /*
           2D Array: Multidimensional Array: simple words as array of arrays
          dataType[1st Dimension][2nd Dimension] arrayName = new dataType[numberOfRow][numberOfColumn];
     */

    //How to declare and assign
    public static String [][] carInfo ={
            {"CarBrand","CarModel","CarColor","CarPrice","CarYear"},
            {"Tesla", "modelX", "black", "80000", "2023"},
            {"BMW", "X8", "Red", "90000", "2020"},
            {"Audi", "A5","Blue","80000","2021"},
    };

    public static void main(String[] args) {
        System.out.println("Car Info" + carInfo[3][2]);

        //how to declare
        String [] [] stName = new String[5][4];//5 is row, and 4 is column
        System.out.println(stName.length);

        stName [0][0] = "sl ";
        stName [0][1] = "FirstName ";
        stName [0][2] = "LastName ";
        stName [0][3] = "Address ";

        stName [1][0] = "101 ";
        stName [1][1] = "James ";
        stName [1][2] = "William ";
        stName [1][3] = "Manhattan, NY ";

        stName [2][0] = "102 ";
        stName [2][2] = "Jack ";
        stName [2][1] = "Cohen";
        stName [2][3] = "Queens,NY";

        stName [3][0] = "103 ";
        stName [3][1] = "Easha ";
        stName [3][2] = "Khanam ";
        stName [3][3] = "Sitka,Alaska ";

        stName [4][0] = "104 ";
        stName [4][1] = "Amar ";
        stName [4][2] = "Alili ";
        stName [4][3] = "Denver,CO";

        try{
            stName [5][0] = "105";
            stName [5][1] = "Parisa";
            stName [5][2] = "Khosravi";
            stName [5][3] = "Irvine,CA";
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bounds exception");
        }

        //System.out.println("Student Name is "+ stName[4][1]);
        /*
            For Each Loop:
                for( DataType variableName: arrayName){ }
         */
        for(String st[]: stName){
            //Convert 2D to 1D

            for(String stn: st){
                System.out.print(stn + "   ");
            }
            System.out.println();

        }



    }

}
