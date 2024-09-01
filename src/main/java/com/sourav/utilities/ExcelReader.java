package com.sourav.utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    private Workbook workbook;
    private Sheet sheet;

    public ExcelReader(String filePath, String sheetName) throws InvalidFormatException {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get the total number of rows
    public int getRowCount() {
        return sheet.getLastRowNum();
    }

    // Method to get the total number of columns
    public int getColumnCount() {
        Row row = sheet.getRow(0);
        return row.getLastCellNum();
    }

    // Method to read data from Excel sheet
    public String getCellData(int rowNum, int colNum) {
        DataFormatter formatter = new DataFormatter();
        Row row = sheet.getRow(rowNum);
        if (row == null) {
            return "";
        }
        return formatter.formatCellValue(row.getCell(colNum));
    }

    // Method to read the entire sheet data into a 2D array (for DataProvider)
    public Object[][] getSheetData() {
        int rowCount = getRowCount();
        int colCount = getColumnCount();
        Object[][] data = new Object[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data[i][j] = getCellData(i + 1, j); // Adjusted for 0-index in array vs 1-index in Excel
            }
        }
        return data;
    }
}
