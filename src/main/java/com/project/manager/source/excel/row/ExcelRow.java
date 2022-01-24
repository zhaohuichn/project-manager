package com.project.manager.source.excel.row;

import com.project.manager.source.excel.Excel;
import com.project.manager.source.excel.cell.ExcelCell;
import com.project.manager.source.excel.sheet.ExcelSheet;

import java.util.List;

/**
 * SheetRow
 *
 * @author ZHAOHUI
 */
public interface ExcelRow {

    /**
     * 所属 excel
     *
     * @return excel
     */
    Excel getExcel();

    /**
     * 所属页签
     *
     * @return sheet
     */
    ExcelSheet getSheet();

    /**
     * 行号
     *
     * @return row no
     */
    int getRowNo();

    /**
     * 是否表头
     *
     * @return bool
     */
    boolean isHeader();

    /**
     * 单元格
     *
     * @return cell list
     */
    List<ExcelCell> getCells();

}
