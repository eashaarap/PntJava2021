package negash;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingOnExcel {

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(); // this will help to create an excel work book
        XSSFSheet sheet =  workbook.createSheet("Sheet1");// will help to create the sheet
        // now we need rows ans cells to write on it
        Row row = sheet.createRow(0);
        Cell A = row.createCell(0);
        Cell B = row.createCell(1);

        A.setCellValue("No.");
        B.setCellValue("Name");
        // Mentoring/For_excel/Testing.xlsc
        // looking for connection
        File f = new File("D:\\2020-2021 Selenium Training\\Selenium\\PntJava2021\\negash/Testing.xlsx");
        FileOutputStream fo = new FileOutputStream(f);
        workbook.write(fo);
        System.out.println("a work book is created ");
        workbook.close();


    }
}
