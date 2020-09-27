package domaci22;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CitanjeExcelTabele {
    public static XSSFWorkbook createExcelInputStream(String excelFilePath) {
        FileInputStream fileInput;
        XSSFWorkbook wbook = null;
        {
            try {
                fileInput = new FileInputStream(excelFilePath);
                wbook = new XSSFWorkbook(fileInput);
                XSSFSheet excelSheet = wbook.getSheetAt(0);
            } catch (FileNotFoundException e) {
                System.out.println("Excel fajl nije pronadjen.");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("Greska. Nepostjeci Excel fajl.");
                e.printStackTrace();
            }
        }
        return wbook;
    }

    public static String readDataFromExcel(String excelFilePath, int rowNum, int celNum) {
        createExcelInputStream(excelFilePath);
        Row row = createExcelInputStream(excelFilePath).getSheetAt(0).getRow(rowNum);
        Cell cell = row.getCell(celNum);
        String s = String.valueOf(createExcelInputStream(excelFilePath).getSheetAt(0).getRow(rowNum).getCell(celNum));
        return s;
    }

    public static void setCellValueString(String excelFIlePath, int numRow, int numCell, String cellValue) {
        XSSFWorkbook wbook = createExcelInputStream(excelFIlePath);
        XSSFSheet sheet = wbook.getSheetAt(0);
        if (readDataFromExcel(excelFIlePath, numRow, numCell) == null) {
            Row row = sheet.createRow(numRow);
            Cell cell = row.createCell(numCell);
            cell.setCellValue(cellValue);
        } else System.out.println("Nije prazna celija.");
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(excelFIlePath);
            wbook.write(os);
            wbook.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fajl nije pronadjen!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void setCellValueInt(String excelFilePath, int numRow, int numCell, int cellValue) {

        XSSFWorkbook wbook = createExcelInputStream(excelFilePath);
        XSSFSheet sheet = wbook.getSheetAt(0);
        if (readDataFromExcel(excelFilePath, numRow, numCell) == null) {
            Row row = sheet.createRow(numRow);
            Cell cell = row.createCell(numCell);
            cell.setCellValue(cellValue);
        } else System.out.println("Nije prazna celija.");

        FileOutputStream os = null;
        try {
            os = new FileOutputStream(excelFilePath);
            wbook.write(os);
            wbook.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fajl nije pronadjen!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}