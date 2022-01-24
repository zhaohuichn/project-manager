package com.project.manager.source.excel.sheet;

import com.project.manager.source.excel.Excel;
import com.project.manager.source.excel.row.ExcelRow;

import java.util.List;
import java.util.Map;

/**
 * StandardRow
 *
 * @author ZHAOHUI
 */
public abstract class AbstractExcelSheet implements ExcelSheet {

    protected Excel excel;

    protected Integer index;

    protected String name;

    protected List<ExcelRow> rows;

    protected ExcelRow header;

    protected List<ExcelRow> dataRows;

    protected Map<Integer, String> columnIndexNameMap;

    @Override
    public String getColumnName(int index) {
        return columnIndexNameMap.getOrDefault(index, "");
    }

    @Override
    public Excel getExcel() {
        return excel;
    }

    public void setExcel(Excel excel) {
        this.excel = excel;
    }

    @Override
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ExcelRow> getRows() {
        return rows;
    }

    public void setRows(List<ExcelRow> rows) {
        this.rows = rows;
    }

    @Override
    public ExcelRow getHeader() {
        return header;
    }

    public void setHeader(ExcelRow header) {
        this.header = header;
    }

    @Override
    public List<ExcelRow> getDataRows() {
        return dataRows;
    }

    public void setDataRows(List<ExcelRow> dataRows) {
        this.dataRows = dataRows;
    }

    public Map<Integer, String> getColumnIndexNameMap() {
        return columnIndexNameMap;
    }

    public void setColumnIndexNameMap(Map<Integer, String> columnIndexNameMap) {
        this.columnIndexNameMap = columnIndexNameMap;
    }
}
