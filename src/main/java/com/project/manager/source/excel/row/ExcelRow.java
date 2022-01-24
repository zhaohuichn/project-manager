package com.project.manager.source.excel.row;

import com.project.manager.source.Source;
import com.project.manager.source.excel.cell.ExcelCell;

import java.util.List;

/**
 * SheetRow
 *
 * @author ZHAOHUI
 */
public interface ExcelRow extends Source {

    boolean isHeader();

    List<ExcelCell> getCells();

}
