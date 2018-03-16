package com.altran.excelReader;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    private static final String excelPath = "data.xlsx";
    private static List<ExcelClass> excelClasses; 

    public static void main(String[] args) throws IOException, InvalidFormatException {
        int header = 1;
        int test_row = 2;
        
        // Retrieving the number of sheets in the Workbook
        try ( // Creating a Workbook from an Excel file (.xls or .xlsx)
              Workbook workbook = WorkbookFactory.create(new File(excelPath))) {
          
            // Getting the Sheet at index zero
            Sheet sheet = workbook.getSheetAt(0);

            boolean isFirstRow = true;
            TestClass test;
            Map<String, TestClass> testCases = new HashMap<>();

            for (Row row: sheet) {
                List variableName = new ArrayList();

                if(isFirstRow){
                    row.cellIterator().forEachRemaining(cell -> variableName.add(getCellValue(cell)));
                    isFirstRow=false;
                }
            }
            
            for (ExcelClass ec : excelClasses)
            {
                System.out.println(ec.getValue());
            }
       } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        
    private static String getCellValue(Cell cell) {
        String cell_data;
        switch (cell.getCellTypeEnum()) {
            case BOOLEAN:
                cell_data = ""+cell.getBooleanCellValue();
                break;
            case STRING:
                cell_data = cell.getRichStringCellValue().getString();
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    cell_data = ""+cell.getDateCellValue();
                } else {
                    cell_data = ""+cell.getNumericCellValue();
                }
                break;
            case FORMULA:
                cell_data = ""+cell.getStringCellValue();
                break;
            case BLANK:
                cell_data = "";
                break;
            default:
                cell_data = "";
        }
        
        return cell_data;    
    }
}

