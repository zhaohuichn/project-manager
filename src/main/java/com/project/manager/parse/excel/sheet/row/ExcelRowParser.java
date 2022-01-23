package com.project.manager.parse.excel.sheet.row;

import com.project.manager.entity.source.excel.row.ExcelRow;
import com.project.manager.parse.Parser;
import org.apache.poi.xssf.usermodel.XSSFRow;

/**
 * ExcelRowParser
 *
 * @author ZHAOHUI
 */
public interface ExcelRowParser extends Parser<XSSFRow, ExcelRow> {


}
