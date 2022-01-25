package com.project.manager.builder;

import com.project.manager.source.excel.cell.ExcelCell;

/**
 * 待办类型列值构造器
 * <p>
 * 待办类型依赖于需求状态及需求排期
 * “待”字开头且日期为明天时，待办类型为”确认“
 * 流程周期内切距离截止时间小于等于阈值时，待办类型为”提醒“。阈值暂定为1
 *
 * @author zhaohui
 */
public class TodoExcelTypeCellBuilder extends AbstractExcelCellValueBuilder<String> {

    public TodoExcelTypeCellBuilder(ExcelCell srcCell) {
        super(srcCell);
    }

    @Override
    public String build() {
        return srcCell.getValue();
    }

}
