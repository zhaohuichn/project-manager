package com.project.manager.pool;

import com.project.manager.entity.source.excel.Excel;
import com.project.manager.parse.excel.StandardExcelParser;

import java.net.URL;
import java.util.concurrent.Callable;

/**
 * InputExcelRowDataParseTask
 *
 * @author ZHAOHUI
 */
public class ExcelCellParseTask implements Callable<Excel> {

    private URL url;

    public ExcelCellParseTask(URL url) {
        this.url = url;
    }

    @Override
    public Excel call() throws Exception {
        return new StandardExcelParser().parse(url);
    }
}
