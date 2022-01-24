package com.project.manager.parse.excel.sheet.row;

import com.project.manager.parse.excel.sheet.cell.ExcelCellParser;
import com.project.manager.parse.excel.sheet.cell.StandardExcelCellParser;
import com.project.manager.source.excel.cell.ExcelCell;
import com.project.manager.source.excel.row.ExcelRow;
import com.project.manager.source.excel.row.StandardRow;
import org.apache.commons.compress.utils.Lists;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.util.Iterator;
import java.util.List;

/**
 * @author ZHAOHUI
 */
public class StandardExcelRowParser implements ExcelRowParser {

    private ExcelCellParser cellParser;

    public StandardExcelRowParser() {
        cellParser = new StandardExcelCellParser();
    }

    @Override
    public ExcelRow parse(Row raw) {
        StandardRow row = new StandardRow();

        int rowNum = raw.getRowNum();
        row.setId(rowNum);
        row.setHeader(0 == rowNum);
        List<ExcelCell> cells = Lists.newArrayList();
        Iterator<Cell> cellIterator = raw.cellIterator();
        while (cellIterator.hasNext()) {
            cells.add(cellParser.parse((cellIterator.next())));
        }
        row.setCells(cells);


        return row;
    }
}
