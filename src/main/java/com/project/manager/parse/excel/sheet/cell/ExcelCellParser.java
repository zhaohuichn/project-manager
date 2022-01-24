package com.project.manager.parse.excel.sheet.cell;

/**
 * ExcelCellParser
 *
 * @author ZHAOHUI
 */
public interface ExcelCellParser<T> {

    String id();

    T parse(Object rawData);

}
