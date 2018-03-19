package com.altran.excelReader;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ExcelMapper {

    private List<String> headers;
    private List<String> testCaseData;
    private List<TestClass> testsList;

    public Map<String, TestClass> testCaseList;

    private static final String FILE_NAME = "/Volumes/backup/dev/frameworkGherkin/frameworkGherkin/framework/data.xlsx";

    public ExcelMapper() {


        headers = new ArrayList();
        testCaseData = new ArrayList<>();
        testsList = new ArrayList<>();

        FileInputStream excelFile = null;
        readExcel(excelFile);

        testsList.forEach(testClass -> headers.forEach(header ->
            testCaseData.forEach(data->
                testClass.getData().put(header,data))));

        testCaseList = new HashMap<>();

        testsList.forEach(test -> testCaseList.put(test.getName(),test));

    }

    public void readExcel(FileInputStream excelFile){


        try {
            excelFile = new FileInputStream(new File(FILE_NAME));

            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> it = datatypeSheet.iterator();

            while (it.hasNext()) {

                Row currentRow = it.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                if(currentRow.getRowNum() == 0){
                    while (cellIterator.hasNext()) {
                        headers.add(getCellValue(cellIterator.next()));
                    }
                }

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();

                    TestClass test = new TestClass();

                    if(currentCell.getColumnIndex() == 0){
                        test.setName(getCellValue(currentCell));
                        testsList.add(test);

                    }else {
                        testCaseData.add(getCellValue(currentCell));
                    }
                }
            }

        } catch (FileNotFoundException e) {
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

    public static void main(String[] args) {

        ExcelMapper reader = new ExcelMapper();
    }
}


