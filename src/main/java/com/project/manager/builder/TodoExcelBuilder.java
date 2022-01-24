package com.project.manager.builder;

import com.project.manager.source.excel.Excel;
import com.project.manager.source.excel.StandardExcel;

/**
 * TodoExcelBuilder
 *
 * @author zhaohui
 */
public class TodoExcelBuilder implements Builder<Excel> {

    private Excel srcExcel;

    public TodoExcelBuilder(Excel src) {
        this.srcExcel = src;
    }

    @Override
    public Excel build() {
        return null;
    }

    private Excel obtainExcel() {
        return new StandardExcel();
    }

}
