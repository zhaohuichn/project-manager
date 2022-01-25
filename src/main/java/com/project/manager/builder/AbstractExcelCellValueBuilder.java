package com.project.manager.builder;

import com.project.manager.source.excel.cell.ExcelCell;

/**
 * 单元格取值构造器
 * <p>
 * 将单元格数据解析成目标数据
 *
 * @author ZHAOHUI
 */
public abstract class AbstractExcelCellValueBuilder<T> implements Builder<T> {

    protected ExcelCell srcCell;

    public AbstractExcelCellValueBuilder(ExcelCell srcCell) {
        this.srcCell = srcCell;
    }


}
