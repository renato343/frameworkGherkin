package com.altran.excelReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Altran
 */
public class ExcelClass {
    private final String header;
    private final String value;
    private final String testName;

    public ExcelClass(String header, String value, String testName)
    {
        this.header = header;
        this.value = value;
        this.testName = testName;
    }

    public String getHeader() {
        return header;
    }

    public String getValue() {
        return value;
    }

    public String getTestName(){return testName;}
}