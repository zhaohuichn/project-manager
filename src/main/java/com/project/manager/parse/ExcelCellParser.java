package com.project.manager.parse;

/**
 * ExcelCellParser
 *
 * @author ZHAOHUI
 */
public interface ExcelCellParser<T> {

    String id();

    T parse(Object rawData);

}
