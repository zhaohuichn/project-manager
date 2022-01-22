package com.project.manager.parse.sheet;

import com.project.manager.entity.dto.ExcelSheetData;
import com.project.manager.entity.po.source.InputExcelSheet;

/**
 * InputExcelSheetParser
 *
 * @author ZHAOHUI
 */
public abstract class InputExcelSheetParser implements ExcelSheetParser<InputExcelSheet> {

    @Override
    public InputExcelSheet parse(ExcelSheetData rawData) {
        InputExcelSheet sheet = obtainInputExcelSheet(rawData);

        return null;
    }

    private InputExcelSheet obtainInputExcelSheet(ExcelSheetData rawData) {
        return new InputExcelSheet(rawData.getUrl());
    }
}
