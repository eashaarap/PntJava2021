package negash;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingOnExcel1 {

    public static void main(String[] args) throws IOException {
        WorkingOnExcel1.writeExcel();

    }// end on main

    public static void writeExcel() throws IOException {
        // start with creating an excel work book
        XSSFWorkbook workbook = new XSSFWorkbook();// after the book need sheet
        XSSFSheet sheet = workbook.createSheet("Sheet1"); // will create a work sheet named sheet1

        for (int row =0 ; row < 10; row ++){// this is to create a 10 rows
            Row rw = sheet.createRow(row);
            for (int col = 0; col < 10; col++){
                Cell cl = rw.createCell(col);
                cl.setCellValue((int)(Math.random()*100));
            }// end of col

        }// end of row
        // looking for connection
        File f = new File("D:\\2020-2021 Selenium Training\\Selenium\\PntJava2021\\negash/Random_Numbers.xlsx"); // holding a file path
        FileOutputStream fo = new FileOutputStream(f);
        workbook.write(fo);
        System.out.println("The file is created ");
        workbook.close();

    }// end of writeExcel method

}// class ended go home
