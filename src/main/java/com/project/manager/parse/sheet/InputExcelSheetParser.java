package com.project.manager.parse.sheet;

import com.project.manager.entity.dto.ExcelSheetData;
import com.project.manager.entity.source.sheet.StandInputExcelSheet;

/**
 * InputExcelSheetParser
 *
 * @author ZHAOHUI
 */
public abstract class InputExcelSheetParser implements ExcelSheetParser<StandInputExcelSheet> {

    @Override
    public StandInputExcelSheet parse(ExcelSheetData rawData) {
        StandInputExcelSheet sheet = obtainInputExcelSheet(rawData);

        return null;
    }

    private StandInputExcelSheet obtainInputExcelSheet(ExcelSheetData rawData) {
        return new StandInputExcelSheet(rawData.getUrl());
    }
}
