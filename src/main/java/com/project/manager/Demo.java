package com.project.manager;

import com.project.manager.pool.ExcelParseTask;
import com.project.manager.source.excel.Excel;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * DemoRun
 *
 * @author ZHAOHUI
 */
public class Demo {

    private static final ExecutorService POOL = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws Exception {
        ExcelParseTask task = new ExcelParseTask(new File("C:\\Users\\wps\\workspace\\doc\\project\\20220121.xlsx").toURI().toURL());
        Future<Excel> future = POOL.submit(task);
        Excel excel = future.get();
        System.out.println(excel.getSheets().get(0).getHeader());
        System.out.println(excel.getSheets().get(0).getDataRows().get(1));
        POOL.shutdownNow();
    }
}
