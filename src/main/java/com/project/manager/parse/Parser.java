package com.project.manager.parse;

/**
 * ExcelCellParser
 *
 * @author ZHAOHUI
 */
public interface Parser<Raw, Rs> {

    /**
     * 解析
     *
     * @param raw 原始数据
     * @return rs
     */
    Rs parse(Raw raw);

}
