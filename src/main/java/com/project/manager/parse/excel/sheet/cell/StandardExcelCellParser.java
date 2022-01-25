package com.project.manager.parse.excel.sheet.cell;

import com.project.manager.source.descriptor.StandardExcelCellDescriptor;
import com.project.manager.source.excel.cell.ExcelCell;
import com.project.manager.source.excel.cell.StandardExcelCell;
import com.project.manager.util.ExcelUtil;
import org.apache.poi.ss.usermodel.Cell;

/**
 * 单元格列解析
 *
 * @author ZHAOHUI
 */
public class StandardExcelCellParser implements ExcelCellParser<Cell, ExcelCell> {

    public StandardExcelCellParser() {

    }

    @Override
    public ExcelCell parse(Cell raw) {
        StandardExcelCell excelCell = new StandardExcelCell();

        int index = raw.getColumnIndex();
        excelCell.setColumnNo(index);
        excelCell.setValue(ExcelUtil.getCellStringValue(raw));
        excelCell.setDescriptor(new StandardExcelCellDescriptor(excelCell, raw));

        return excelCell;
    }
}
