package RetosPush;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingAExcelFile {

    public static String filePath ="../Practice/DataTest/CreatingAExcelFile.xlsx";

    public static void main(String[] args) throws IOException {
        Object[][] TutoringSquad = {
                {"stId","stFirst_Name","stLastName","stAge"},
                {"102", "Aleign", "Negash", "6"},
                {"103", "Easha", "Khanam", "2"},
                {"104", "Simar", "Kaur", "4"},
                {"105", "Nafiz", "Islam", "1"},
                {"106", "Israt", "Reto", "5"}

        };
        createExcel(filePath,"studentsDetail",TutoringSquad);

    }

    //we need to create a 2d array becasue excel is 2d : object[][] + name of ur table
    public static void createExcel(String path, String sheetName, Object[][] randomName) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        System.out.println("Excel sheet is created!!! :)");
        int rowNum = 0;
        for(Object [] row1 : randomName){
            XSSFRow row = sheet.createRow(rowNum++);
            int columnNamne = 0;
            for(Object colu : row1){
                XSSFCell column = row.createCell(columnNamne++);

                if(colu instanceof String){
                    column.setCellValue((String)colu);
                }else if(colu instanceof Integer){
                    column.setCellValue((Integer)colu);
                }
            }
        }

        FileOutputStream output = new FileOutputStream(path);
        workbook.write(output);
        workbook.close();





    }








}//end of class
