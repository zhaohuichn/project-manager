package com.project.manager.parse.sheet;

/**
 * ExcelCellParser
 *
 * @author ZHAOHUI
 */
public interface ExcelSheetParser<T> {

    String id();

    T parse(Object rawData);

}
