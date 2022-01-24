package com.project.manager.parse.excel.sheet;

import com.project.manager.entity.source.excel.Excel;
import com.project.manager.entity.source.excel.sheet.ExcelSheet;
import com.project.manager.parse.Parser;

/**
 * ExcelCellParser
 *
 * @author ZHAOHUI
 */
public interface ExcelSheetParser extends Parser<Excel, ExcelSheet> {

    ExcelSheet parse(Excel excel, int sheetIndex);

}
