package com.project.manager.parse.excel.sheet;

import com.project.manager.parse.Parser;
import com.project.manager.source.excel.sheet.ExcelSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 * ExcelCellParser
 *
 * @author ZHAOHUI
 */
public interface ExcelSheetParser extends Parser<XSSFSheet, ExcelSheet> {
}
