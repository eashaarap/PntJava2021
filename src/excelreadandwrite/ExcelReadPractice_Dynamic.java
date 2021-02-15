package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadPractice_Dynamic {

    //create path to access excel file
    public static String file = "../PnTSession/DataTest/pnt_class.xlsx";


    public static void main(String[] args) throws IOException {
        readExcel(file,0);

    }

    /**
     * This method will read from any excel file
     * @param path
     * @param sheetIndex
     * @throws IOException
     * author: Easha
     */
    public static void readExcel(String path, int sheetIndex) throws IOException {
        FileInputStream input = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(input);
        Sheet sheet = workbook.getSheetAt(sheetIndex);

        for(Row row: sheet){
            for(Cell cell: row){
                switch(cell.getCellType()){
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue()+"\t");
                        break;
                    case STRING:
                        System.out.print(cell.getStringCellValue()+"\t");
                        break;
                    case BLANK:
                        System.out.print("Blank" + "\t");
                        break;
                }
            }
            System.out.println();
        }//end of for loop
        input.close();
    }//end of method



}//end of class
