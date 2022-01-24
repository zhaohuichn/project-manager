package com.project.manager.source.excel.cell;

import com.project.manager.source.descriptor.Descriptor;
import com.project.manager.source.excel.Excel;
import com.project.manager.source.excel.row.ExcelRow;
import com.project.manager.source.excel.sheet.ExcelSheet;

/**
 * SheetRow
 *
 * @author ZHAOHUI
 */
public interface ExcelCell {

    /**
     * 所属表格
     *
     * @return excel
     */
    Excel getExcel();

    /**
     * 所属页签
     *
     * @return
     */
    ExcelSheet getSheet();

    /**
     * 所属行
     *
     * @return row
     */
    ExcelRow getExcelRow();

    /**
     * 列序号
     *
     * @return 列序号
     */
    int getColumnNo();

    /**
     * 列名
     *
     * @return 列名称
     */
    String getColumnName();

    /**
     * 列值
     *
     * @return value
     */
    String getValue();

    Descriptor getDescriptor();

}
