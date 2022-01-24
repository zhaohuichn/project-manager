package com.project.manager.pool;

import com.project.manager.parse.excel.StandardExcelParser;
import com.project.manager.source.excel.Excel;

import java.io.File;
import java.util.concurrent.Callable;

/**
 * InputExcelRowDataParseTask
 *
 * @author ZHAOHUI
 */
public class ExcelParseTask implements Callable<Excel> {

    private String url;

    public ExcelParseTask(String url) {
        this.url = url;
    }

    @Override
    public Excel call() throws Exception {
        return new StandardExcelParser().parse(new File(url));
    }
}
