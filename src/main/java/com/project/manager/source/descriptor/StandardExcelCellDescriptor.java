package com.project.manager.source.descriptor;

import com.project.manager.source.excel.cell.ExcelCell;
import org.apache.poi.ss.usermodel.Cell;

/**
 * ExcelCellDescriptor
 *
 * @author ZHAOHUI
 */
public class StandardExcelCellDescriptor implements Descriptor {
    private ExcelCell excelCell;

    private Cell rawCell;

    public StandardExcelCellDescriptor() {

    }

    public StandardExcelCellDescriptor(ExcelCell excelCell, Cell rawCell) {

    }

    public ExcelCell getExcelCell() {
        return excelCell;
    }

    public void setExcelCell(ExcelCell excelCell) {
        this.excelCell = excelCell;
    }

    public Cell getRawCell() {
        return rawCell;
    }

    public void setRawCell(Cell rawCell) {
        this.rawCell = rawCell;
    }
}
