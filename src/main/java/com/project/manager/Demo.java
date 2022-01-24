package com.project.manager;

import com.project.manager.source.excel.Excel;
import com.project.manager.pool.ExcelCellParseTask;

import java.io.File;
import java.util.concurrent.FutureTask;

/**
 * DemoRun
 *
 * @author ZHAOHUI
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        ExcelCellParseTask task = new ExcelCellParseTask(new File("C:\\Users\\wps\\workspace\\doc\\project\\20220121.xlsx").toURI().toURL());
        FutureTask<Excel> futureTask = new FutureTask(task);
        new Thread(futureTask).start();
        Excel excel = futureTask.get();
        System.out.println(excel.getSheets().get(0).getHeader());
        System.out.println(excel.getSheets().get(0).getDataRows());
    }
}
