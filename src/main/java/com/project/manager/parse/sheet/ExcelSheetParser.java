package com.project.manager.parse.sheet;

import com.project.manager.entity.dto.ExcelSheetData;

/**
 * ExcelCellParser
 *
 * @author ZHAOHUI
 */
public interface ExcelSheetParser<T> {

    T parse(ExcelSheetData rawData);

}
