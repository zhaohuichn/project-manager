package com.project.manager.pool;

import com.project.manager.builder.ExcelSheetDataBuilder;
import com.project.manager.entity.dto.ExcelSheetData;

import java.util.concurrent.Callable;

/**
 * InputExcelRowDataParseTask
 *
 * @author ZHAOHUI
 */
public class InputExcelRowDataParseTask implements Callable<ExcelSheetData> {

    private ExcelSheetDataBuilder builder;

    public InputExcelRowDataParseTask(ExcelSheetDataBuilder builder) {
        this.builder = builder;
    }

    @Override
    public ExcelSheetData call() throws Exception {
        return builder.build();
    }
}
