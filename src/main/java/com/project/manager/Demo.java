package com.project.manager;

import com.project.manager.entity.source.excel.Excel;
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
        ExcelCellParseTask task = new ExcelCellParseTask(new File("D:\\doc\\design\\20220120.xlsx").toURI().toURL());
        FutureTask<Excel> futureTask = new FutureTask(task);
        new Thread(futureTask).start();
        Excel data = futureTask.get();
        System.out.println(data.getSheets().get(0));
    }
}
