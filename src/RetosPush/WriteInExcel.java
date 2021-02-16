package RetosPush;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteInExcel {
    public static String newFile = "../Practice/DataTest/CreatedExcel.xlsx";

    public static void main(String[] args) throws IOException {
        Object[][] students = {
                {"stId","stFirst_Name","stLastName","stAge"},
                {"102", "Aleign", "Negash", "6"},
                {"103", "Easha", "Khanam", "2"},
                {"104", "Simar", "Kaur", "4"},
                {"105", "Nafiz", "Islam", "1"},
                {"106", "Israt", "Reto", "5"}

        };

        writing(newFile,"StudentDeets",students);

    }
    public static void writing(String filePath, String sheetName, Object[][] anyname) throws IOException {
        XSSFWorkbook  workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        System.out.println("Excel sheet is created");
        int rownum = 0;
        for(Object[] row1: anyname){
            XSSFRow row = sheet.createRow(rownum++);
            int cellnum = 0;
            for(Object cel : row1){
                XSSFCell cell = row.createCell(cellnum++);
                if(cel instanceof String){
                    cell.setCellValue((String)cel);

                }else if(cel instanceof Integer){
                    cell.setCellValue((Integer)cel);
                }
            }

        }

        FileOutputStream output = new FileOutputStream(filePath);
        workbook.write(output);
        workbook.close();












    }






}
