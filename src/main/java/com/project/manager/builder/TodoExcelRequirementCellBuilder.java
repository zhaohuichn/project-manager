package com.project.manager.builder;

import com.project.manager.source.excel.cell.ExcelCell;

/**
 * 需求名称列值构造器
 * <p>
 * 经办人标准输入格式为：岗位：姓名，每行一人
 * 经办人将按照所在部门分组依次取值，每个部门取1个人作为经办人
 *
 * @author zhaohui
 */
public class TodoExcelRequirementCellBuilder extends AbstractExcelCellValueBuilder<String> {

    public TodoExcelRequirementCellBuilder(ExcelCell srcCell) {
        super(srcCell);
    }

    @Override
    public String build() {
        return srcCell.getValue();
    }

}
