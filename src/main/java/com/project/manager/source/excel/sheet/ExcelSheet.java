package com.project.manager.source.excel.sheet;

import com.project.manager.source.excel.Excel;
import com.project.manager.source.excel.row.ExcelRow;

import java.util.List;

/**
 * ExcelSheet
 *
 * @author ZHAOHUI
 */
public interface ExcelSheet {
    /**
     * 所属excel
     *
     * @return excel
     */
    Excel getExcel();

    /**
     * 页签索引。从0开始
     *
     * @return index
     */
    Integer getIndex();

    /**
     * 表头
     *
     * @return header row
     */
    ExcelRow getHeader();

    /**
     * 数据行（除表头外的行）
     *
     * @return data row list
     */
    List<ExcelRow> getDataRows();

    /**
     * 列名称
     *
     * @param columnNo 列序号
     * @return column name
     */
    String getColumnName(int columnNo);

}
