package com.project.manager.builder;

import com.project.manager.entity.dto.ExcelSheetData;

/**
 * InputExcelRowDataBuilder
 *
 * @author ZHAOHUI
 */
public class OutputExcelSheetDataBuilder implements Builder<ExcelSheetData> {

    private ExcelSheetData excelSheetData;

    public OutputExcelSheetDataBuilder(ExcelSheetData excelSheetData) {
        // 逐行解析，每个字段都需要特定的解析器


    }

    @Override
    public ExcelSheetData build() {
        return null;
    }
}
