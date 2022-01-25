package com.project.manager.builder;

import com.project.manager.source.excel.cell.ExcelCell;

/**
 * 所属模块列值构造器
 * <p>
 * 每个行都有所属分组字段，直接从模块取值即可
 *
 * @author zhaohui
 */
public class TodoExcelModuleCellBuilder extends AbstractExcelCellValueBuilder<String> {

    public TodoExcelModuleCellBuilder(ExcelCell srcCell) {
        super(srcCell);
    }

    @Override
    public String build() {
        return srcCell.getValue();
    }

}
