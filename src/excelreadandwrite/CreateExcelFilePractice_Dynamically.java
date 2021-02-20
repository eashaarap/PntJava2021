package excelreadandwrite;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcelFilePractice_Dynamically {

    //create your file path
    public static String filePath = "../PnTSession/DataTest/ICreatedThisFileFromScratch.xlsx";

    public static void main(String[] args) throws IOException {

        // create arrayList to add the values to your file
        Object [][] fruits = {
                {"fruitID","typesOfFruit","fruitColor", "fruitTaste"},
                {"101","Orange","Orange", "Sour"},
                {"102","Mango","Orange", "Sweet"},
                {"103","JackFruit","Yellowish", "Bitter"},
                {"104","Guava","Green", "Sour"},
                {"105","Boroi","Red", "Sour"},

        };

        //call method ( filePathName, "Name of Table", nameOfObject/ArrayList);
        createExcel(filePath,"Fruit Names",fruits);

    }
    //step 1. what parameters do we need to pass? :
         //we need a path, sheetName, we need 2d array(because excel file is 2D): Object[][] + nameOfYourTable(for now)
    public static void createExcel(String path, String sheetName, Object [] [] randomName ) throws IOException {

        //Create a workbook object: XSSFWorkbook nameofWorkbook = new XSSWorkBook();
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Create a sheet: XSSFSheet nameofSheet = nameOfWorkbook.createSheet(sheetName);tyyyyye 2qn\
        XSSFSheet sheet = workbook.createSheet(sheetName);

        // just a print out statement to make sure we can see code is working
        System.out.println("Our Excel File Was Created Successfully, GO CHECK!!!!");

        //initialize your rows to 0 because thats where you want to start
        int rowNum =0;

        //Now we need to loop through the table to add rows and columns
        //convert 2d to 1d step 1
        for(Object [] tableRow: randomName){

            //to create rows
            XSSFRow row = sheet.createRow(rowNum++);

            //initialize your columns to 0 because thats where you want to start
            int rowCol = 0;

            //convert 2d to 1d step 2
            for(Object tableCol: tableRow){

                //to create columns/cells
                XSSFCell cell = row.createCell(rowCol++);

                //to add values to each cell we need a if/switch statement
                if( tableCol instanceof String){ // comparing the cells(tableCol) to String value if it is type String
                    cell.setCellValue((String)tableCol);// then convert whatever value that is in there to String
                } else if(tableCol instanceof Integer){//comparing the cells to Integer value if its type Integer
                    cell.setCellValue((Integer)tableCol);//then convert whatever value thats in there to an Integer
                }

            }
        }
        // now we have to take all our data and write it into our workbook
        //So we're using FileOutputStream instead of InputStream because we are outputting our data not taking it in
        FileOutputStream outputStream = new FileOutputStream(path);

        //using the workbook object we created we are writing into that excel file while passing our outputstream
        workbook.write(outputStream);

        //closing the workbook so its not taking up memory when we are not using it
        workbook.close();

    }// end of method
}// end of class
