package com.project.manager.parse.excel.sheet;

import com.project.manager.entity.source.excel.Excel;
import com.project.manager.entity.source.excel.sheet.ExcelSheet;

/**
 * InputExcelSheetParser
 *
 * @author ZHAOHUI
 */
public abstract class AbstractExcelSheetParser implements ExcelSheetParser {

    @Override
    public ExcelSheet parse(Excel excel, int sheetIndex) {
        return null;
    }


}
