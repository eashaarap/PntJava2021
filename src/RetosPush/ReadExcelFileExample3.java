package RetosPush;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFileExample3 {
    public static void main(String[] args) throws IOException {
        String filePath = "../Practice/DataTest/ATM_Testcases_Monday.xlsx";
        readExcel(filePath,0,3,2);

    }
    public static void readExcel(String filePath, int sheetIndex, int rowName, int cellName ) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        Workbook work = new XSSFWorkbook(inputStream);
        Sheet sheet = work.getSheetAt(sheetIndex);
        //Sheet sheet1 = work.getSheet("sheet1");
        Row row = sheet.getRow(rowName);
        Cell cell = row.getCell(cellName);
        System.out.println(cell);


    }





}
