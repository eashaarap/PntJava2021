package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadExcelFile {
    //File location: creating the path for our file to be read
    public static String filePath = "../PnTSession/DataTest/pnt_class.xlsx";
    public static void main(String[] args) {
        ReadExcelFile.readExcelFile(filePath, 0);

    }

    public static void readExcelFile(String filePath, int sheetNumber) {
        try{
            //For InputSteam: taking the path so we can use it
            FileInputStream inputStream = new FileInputStream(filePath);

            //Workbook allows us to use excel file
            Workbook workbook = new XSSFWorkbook(inputStream);
            //Which sheet you want to read?
            Sheet dataTypeSheet = workbook.getSheetAt(sheetNumber);
            // will help us iterate through the rows
            Iterator<Row> rowIterator = dataTypeSheet.iterator();

            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();

                // will help us iterate through the cells
                Iterator<Cell> cellIterator = currentRow.iterator();

                while(cellIterator.hasNext()) {//again we need to check how many values we have in the current row
                    //will check if values are in the cell
                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + "       ");
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + "         ");
                    }
                }
                System.out.println();
            }


        } catch (FileNotFoundException fn) {
            System.out.println("File Not Found");
        } catch ( IOException io){
            System.out.println("Reading done");
        }

    }
}
