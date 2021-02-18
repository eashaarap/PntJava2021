package excelreadandwrite;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelPP {

    public static void main(String[] args) throws IOException {

        //Create path for excel
        File filePath = new File("../PnTSession/DataTest/pnt_class.xlsx");

        //Using FileInputStream to get to the path: locating Excel
        FileInputStream input = new FileInputStream(filePath);

        //to open path: basically opening up Excel in PC
        Workbook workbook = WorkbookFactory.create(input);

        //find excel sheet:
        Sheet sheet=workbook.getSheetAt(0);

        //we look for Row: where do we find rows? inside the sheet
        Row row=sheet.getRow(1);

        //we now get the cell: to get the cell we use the row
        Cell cell =row.getCell(1);
        System.out.println(cell);

        input.close();

    }
}

