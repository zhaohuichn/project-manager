package com.project.manager.parse;

/**
 * ExcelCellParser
 *
 * @author ZHAOHUI
 */
public interface ExcelParser<T> {

    T parse(Object rawData);

}
