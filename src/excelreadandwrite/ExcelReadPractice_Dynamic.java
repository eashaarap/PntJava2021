package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    We will be reading through a pre-made excel file and get ALL values from the table
 */

public class ExcelReadPractice_Dynamic {
    //STEP 1
    //create path to access excel file
    public static String file = "../PnTSession/DataTest/pnt_class.xlsx";


    //STEP 3
    public static void main(String[] args) throws IOException {
        readExcel(file,0);

    }

    /**
     * This method will read from any excel file
     */

    //STEP 2
    public static void readExcel(String path, int sheetIndex) throws IOException {
        //Create path for excel, and pass 'path' parameter because we will be getting this path later
        FileInputStream input = new FileInputStream(path);

        //to open path: basically opening up Excel in PC, and pass inputStream we created
        Workbook workbook = WorkbookFactory.create(input);

        //find excel/workbook sheet: and pass sheetIndex(which sheet we will be using) parameter
        Sheet sheet = workbook.getSheetAt(sheetIndex);

        //use loop to iterate through the table:
            //first loop will loop through the Rows
        for(Row row: sheet){
            //second loop will loop through the Cells
            for(Cell cell: row){

                //now we need to evaluate the value within the cell; can use if else statement
                switch(cell.getCellType()){
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()+"\t");//print the value you are getting + space(\t)
                        break;
                    case STRING:
                        System.out.print(cell.getStringCellValue()+"\t");
                        break;
                    case BLANK:
                        System.out.print("Blank" + "\t");
                        break;
                }
            }
            // add a line so it loops to the next line
            System.out.println();

        }//end of for loop
        input.close();

    }//end of method



}//end of class
