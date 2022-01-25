package com.project.manager.source.excel.row;

import com.project.manager.source.excel.Excel;
import com.project.manager.source.excel.cell.ExcelCell;
import com.project.manager.source.excel.sheet.ExcelSheet;

import java.util.List;

/**
 * StandardRow
 *
 * @author ZHAOHUI
 */
public abstract class AbstractExcelRow implements ExcelRow {

    protected int rowNo;

    protected ExcelSheet sheet;

    protected boolean header;

    protected List<ExcelCell> cells;

    @Override
    public int getRowNo() {
        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    @Override
    public ExcelSheet getSheet() {
        return sheet;
    }

    public void setSheet(ExcelSheet sheet) {
        this.sheet = sheet;
    }

    @Override
    public boolean isHeader() {
        return header;
    }

    public void setHeader(boolean header) {
        this.header = header;
    }

    @Override
    public List<ExcelCell> getCells() {
        return cells;
    }

    public void setCells(List<ExcelCell> cells) {
        this.cells = cells;
    }

    @Override
    public Excel getExcel() {
        return sheet.getExcel();
    }

    @Override
    public ExcelCell cellAt(int pos) {
        return cells.get(pos);
    }
}
