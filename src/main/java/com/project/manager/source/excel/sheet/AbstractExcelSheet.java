package com.project.manager.source.excel.sheet;

import com.project.manager.enums.SourceTypeEnum;
import com.project.manager.source.excel.row.ExcelRow;

import java.net.URL;
import java.util.List;

/**
 * StandardRow
 *
 * @author ZHAOHUI
 */
public abstract class AbstractExcelSheet implements ExcelSheet {

    protected Integer id;

    protected String name;

    protected List<ExcelRow> rows;

    protected ExcelRow header;

    protected List<ExcelRow> dataRows;

    @Override
    public SourceTypeEnum type() {
        return SourceTypeEnum.SHEET;
    }

    @Override
    public String abstractPath() {
        return null;
    }

    @Override
    public URL url() {
        return null;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<ExcelRow> getRows() {
        return rows;
    }

    public void setRows(List<ExcelRow> rows) {
        this.rows = rows;
    }
}
