package com.project.manager.source.excel.row;

import com.project.manager.source.excel.cell.ExcelCell;
import com.project.manager.enums.SourceTypeEnum;

import java.net.URL;
import java.util.List;

/**
 * StandardRow
 *
 * @author ZHAOHUI
 */
public abstract class AbstractExcelRow implements ExcelRow {

    protected Integer id;

    protected boolean header;

    protected List<ExcelCell> cells;

    public boolean isHeader() {
        return 0 == id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ExcelCell> getCells() {
        return cells;
    }

    public void setCells(List<ExcelCell> cells) {
        this.cells = cells;
    }

    @Override
    public SourceTypeEnum type() {
        return SourceTypeEnum.ROW;
    }

    @Override
    public String abstractPath() {
        return id.toString();
    }

    @Override
    public URL url() {
        return null;
    }

    public void setHeader(boolean header) {
        this.header = header;
    }
}
