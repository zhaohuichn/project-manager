package com.project.manager.pool;

import com.project.manager.builder.OutputExcelSheetDataBuilder;
import com.project.manager.entity.dto.ExcelSheetData;

import java.util.concurrent.Callable;

/**
 * InputExcelRowDataParseTask
 *
 * @author ZHAOHUI
 */
public class OutputExcelRowDataParseTask implements Callable<ExcelSheetData> {

    private OutputExcelSheetDataBuilder builder;

    public OutputExcelRowDataParseTask(OutputExcelSheetDataBuilder builder) {
        this.builder = builder;
    }

    @Override
    public ExcelSheetData call() throws Exception {
        return builder.build();
    }
}
