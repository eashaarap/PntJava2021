package negash;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFromExcel {
    public static void main(String[] args) throws IOException {
        ReadingFromExcel.readExcel();
        ReadingFromExcel.readExcelWzLoop();
    }// end of main

    public static void readExcel() throws IOException {
        // the first step should be looking for the file we need to read
        File path = new File("../PntJava2021/negash/Random_Numbers2.xlsx");// in the parenthesis pass the file location
//        System.out.println("negash/Random_Numbers.xlsx");
        FileInputStream fi = new FileInputStream(path); // using an input stream will pass the path to the file
        Workbook workbook = WorkbookFactory.create(fi); //am not sure how I explain it to myself - I think create the file for reading
        // it seems it is a final class with a class loader
        Sheet sheet = workbook.getSheetAt(0); // this will direct the first index - first sheet from the work book
        Row row = sheet.getRow(0); // directing to the first row of the identified sheet
        Cell cell = row.getCell(0); // now get the value from the cell

        System.out.println(cell); // reading
        fi.close();
    }
    public static void readExcelWzLoop() throws IOException {
        // the first step should be looking for the file we need to read
        File path = new File("../PntJava2021/negash/Random_Numbers.xlsx");// in the parenthesis pass the file location

        FileInputStream fi = new FileInputStream(path); // using an input stream will pass the path to the file
        Workbook workbook = WorkbookFactory.create(fi); //am not sure how I explain it to myself - I think create the file for reading
        // it seems it is a final class with a class loader
        Sheet sheet = workbook.getSheetAt(0); // this will direct the first index - first sheet from the work book
        // using a for each loop combined with a switch
        for (Row row : sheet){
            for (Cell cell: row){
                switch (cell.getCellType()){
                    case STRING:
                        System.out.print(cell.getStringCellValue() +"\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()+"\t");
                        break;
                    case BLANK:
                        System.out.print("Blank"+"\t");
                        break;

                }// end of switch
            }// end of cell lop
            System.out.println();
        }// end of row loop




//        Cell cll;
//        for(int row = 0; row < 10; row++) {
//            Row rw = sheet.getRow(row); // directing to the first row of the identified sheet
//            for(int col=0; col < 10; col++) {
//                cll = rw.getCell(col); // now get the value from the cell
//            }
//        }
//        for(int read: cll) // reading
        fi.close();
    }


}// end of class
