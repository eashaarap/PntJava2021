package RetosPush;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadAllInputFromExcelFile {
    public static String path ="../Practice/DataTest/DataReaderPractice.xlsx";

    public static void main(String[] args) throws IOException {
        readingAllInput(path,"Sheet1");

    }

    public static void readingAllInput(String filePath,String sheetName) throws IOException {
        FileInputStream inputStream = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        for(Row row : sheet){
            for(Cell cell : row){
                switch(cell.getCellType()){
                    case NUMERIC:
                        System.out.print((int) (cell.getNumericCellValue())+"\t");
                        break;
                    case STRING:
                        System.out.print(cell.getStringCellValue()+"\t");
                        break;
                    case BLANK:
                        System.out.print("it is blank" + "\t");
                       break;

                }
            }
            System.out.println();
        }

        inputStream.close();




    }





}
