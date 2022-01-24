package com.project.manager;

import com.project.manager.parse.excel.StandardExcelParser;
import com.project.manager.source.excel.Excel;

import java.io.File;

/**
 * DemoRun
 *
 * @author ZHAOHUI
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        String location = "D:\\doc\\design\\20220120.xlsx";
        File file = new File(location);
        Excel excel = new StandardExcelParser().parse(file);

        String outFile = "C:\\Users\\wps\\workspace\\doc\\project\\20220122_todo.xlsx";
        System.out.println(excel.getSheets().get(0).getHeader());
        System.out.println(excel.getSheets().get(0).getDataRows().get(1));
    }
}
