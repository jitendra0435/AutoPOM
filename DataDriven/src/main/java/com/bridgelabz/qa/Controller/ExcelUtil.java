package com.bridgelabz.qa.Controller;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtil {
    XSSFSheet sheet;
    XSSFWorkbook workbook;

    public ExcelUtil(String excelPath) throws IOException {
        File file = new File(excelPath);
        try
        {
            FileInputStream fis = new FileInputStream(file);
            this.workbook = new XSSFWorkbook(fis);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public String getData(int sheetNumber, int row, int column)
    {
        this.sheet = this.workbook.getSheetAt(0);
        Cell cell = this.sheet.getRow(row).getCell(column);
        cell.setCellType(CellType.STRING);
        String data = cell.getStringCellValue();
        return data;
    }

    public int getRowCount(int sheetIndex)
    {
        int rowNum = this.workbook.getSheetAt(sheetIndex).getLastRowNum();
        ++rowNum;
        return rowNum;
    }
}