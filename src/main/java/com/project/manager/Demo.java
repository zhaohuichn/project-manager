package com.project.manager;

import com.project.manager.builder.ExcelSheetDataBuilder;
import com.project.manager.entity.dto.ExcelSheetData;
import com.project.manager.pool.InputExcelRowDataParseTask;

import java.util.concurrent.FutureTask;

/**
 * DemoRun
 *
 * @author ZHAOHUI
 */
public class Demo {

    public static void main(String[] args) throws Exception {
        InputExcelRowDataParseTask task =
                new InputExcelRowDataParseTask(new ExcelSheetDataBuilder("D:\\doc\\design\\20220120.xlsx"));
        FutureTask<ExcelSheetData> futureTask = new FutureTask(task);
        new Thread(futureTask).start();
        ExcelSheetData data = futureTask.get();
        System.out.println(data.getCellNameMap());
        System.out.println(data.getCellValueMap());
    }
}
