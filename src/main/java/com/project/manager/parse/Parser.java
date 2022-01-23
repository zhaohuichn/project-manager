package com.project.manager.parse;

/**
 * ExcelCellParser
 *
 * @author ZHAOHUI
 */
public interface Parser<Raw, Rs> {

    Rs parse(Raw raw);

}
