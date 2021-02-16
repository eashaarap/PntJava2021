package RetosPush;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFileExample2 {
    public static void main(String[] args) throws IOException {

        readExcelFile(0,4,3);
    }


    public static void readExcelFile(int sheetNumber, int rowNumber, int cellNumber) throws IOException {
        File filepath = new File("../Practice/DataTest/DataReaderPractice.xlsx");
        FileInputStream input = new FileInputStream(filepath);
        Workbook workbook = new XSSFWorkbook(input);
        Sheet sheet = workbook.getSheetAt(sheetNumber);
        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(cellNumber);
        System.out.println(cell);

    }




}
