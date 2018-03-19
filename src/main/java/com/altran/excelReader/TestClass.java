package com.altran.excelReader;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

    private String name;
    private Map<String,String> data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestClass() {
        data = new HashMap<>();
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
