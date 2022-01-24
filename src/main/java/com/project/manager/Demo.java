package com.project.manager;

import com.project.manager.parse.excel.StandardExcelParser;
import com.project.manager.source.excel.Excel;

import java.io.File;
import java.net.URL;

/**
 * DemoRun
 *
 * @author ZHAOHUI
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        String location = "C:\\Users\\wps\\workspace\\doc\\project\\20220121.xlsx";
        URL url = new File(location).toURI().toURL();
        Excel excel = new StandardExcelParser().parse(url);

        String outFile = "C:\\Users\\wps\\workspace\\doc\\project\\20220122_todo.xlsx";


        System.out.println(excel.getSheets().get(0).getHeader());
        System.out.println(excel.getSheets().get(0).getDataRows().get(1));
    }
}
