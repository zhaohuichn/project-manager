package com.project.manager.parse.excel.sheet;

import com.google.common.collect.Lists;
import com.project.manager.parse.excel.sheet.row.ExcelRowParser;
import com.project.manager.parse.excel.sheet.row.StandardRowParser;
import com.project.manager.source.excel.row.ExcelRow;
import com.project.manager.source.excel.sheet.ExcelSheet;
import com.project.manager.source.excel.sheet.StandardSheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.Iterator;
import java.util.List;

/**
 * InputExcelSheetParser
 *
 * @author ZHAOHUI
 */
public class StandardExcelSheetParser extends AbstractExcelSheetParser {

    private ExcelRowParser rowParser;

    public StandardExcelSheetParser() {
        rowParser = new StandardRowParser();
    }


    @Override
    public ExcelSheet parse(XSSFSheet raw) {
        StandardSheet sheet = new StandardSheet();
        int index = raw.getWorkbook().getSheetIndex(raw);
        sheet.setId(index);
        sheet.setName(raw.getSheetName());

        List<ExcelRow> rows = Lists.newArrayList();
        Iterator<Row> rowIterator = raw.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            rows.add(rowParser.parse(row));
        }
        sheet.setRows(rows);

        return sheet;
    }
}
