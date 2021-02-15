package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelPracticeRead {

    public static void main(String[] args) throws IOException {

        //Create path for excel
        File filePath = new File("../PnTSession/DataTest/pnt_class.xlsx");

        //Using FileInputStream to get to the path: locating Excel
        FileInputStream input = new FileInputStream(filePath);

        //to open path: basically opening up Excel in PC
        Workbook workbook = WorkbookFactory.create(input);

        //find excel/workbook sheet:
        Sheet sheet = workbook.getSheetAt(0);

        //Now that we found the sheet, we now look for Row: where do we find row? in the sheet
        Row row = sheet.getRow(1);

        //Once we get the row, now we must find the cell we want: to get the cell(count top down, not left to right) we
        // must use the row
        Cell cell = row.getCell(1);
        System.out.println(cell);
    }
}
