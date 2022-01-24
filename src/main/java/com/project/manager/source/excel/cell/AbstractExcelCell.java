package com.project.manager.source.excel.cell;

import com.project.manager.source.descriptor.Descriptor;
import com.project.manager.source.excel.Excel;
import com.project.manager.source.excel.row.ExcelRow;
import com.project.manager.source.excel.sheet.ExcelSheet;

/**
 * StandardRow
 *
 * @author ZHAOHUI
 */
public abstract class AbstractExcelCell implements ExcelCell {

    protected ExcelRow excelRow;

    protected int columnNo;

    private String value;

    private Descriptor descriptor;

    /**
     * 所属表格
     *
     * @return excel
     */
    @Override
    public Excel getExcel() {
        return excelRow.getExcel();
    }

    /**
     * 所属页签
     *
     * @return
     */
    @Override
    public ExcelSheet getSheet() {
        return excelRow.getSheet();
    }

    @Override
    public ExcelRow getExcelRow() {
        return excelRow;
    }

    public void setExcelRow(ExcelRow excelRow) {
        this.excelRow = excelRow;
    }

    @Override
    public int getColumnNo() {
        return columnNo;
    }

    public void setColumnNo(int columnNo) {
        this.columnNo = columnNo;
    }

    @Override
    public String getColumnName() {
        return getSheet().getColumnName(columnNo);
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Descriptor getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(Descriptor descriptor) {
        this.descriptor = descriptor;
    }
}
