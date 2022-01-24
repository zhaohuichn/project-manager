package com.project.manager.builder;

import com.project.manager.source.excel.cell.ExcelCell;

/**
 * ExcelCellValueBuilder
 *
 * @author ZHAOHUI
 */
public class ExcelCellValueBuilder implements Builder<String> {

    private ExcelCell srcCell;

    public ExcelCellValueBuilder(ExcelCell srcCell) {
        this.srcCell = srcCell;
    }

    @Override
    public String build() {
        return null;
    }

}
