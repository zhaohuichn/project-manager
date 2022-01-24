package com.project.manager.parse.excel.sheet;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.project.manager.parse.excel.sheet.row.ExcelRowParser;
import com.project.manager.parse.excel.sheet.row.StandardExcelRowParser;
import com.project.manager.source.excel.cell.ExcelCell;
import com.project.manager.source.excel.row.ExcelRow;
import com.project.manager.source.excel.sheet.ExcelSheet;
import com.project.manager.source.excel.sheet.StandardSheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * InputExcelSheetParser
 *
 * @author ZHAOHUI
 */
public class StandardExcelSheetParser extends AbstractExcelSheetParser {

    private ExcelRowParser rowParser;

    public StandardExcelSheetParser() {
        rowParser = new StandardExcelRowParser();
    }


    @Override
    public ExcelSheet parse(XSSFSheet raw) {
        StandardSheet sheet = new StandardSheet();
        int index = raw.getWorkbook().getSheetIndex(raw);
        sheet.setIndex(index);
        sheet.setName(raw.getSheetName());
        setRows(sheet, raw);
        setHeader(sheet);
        setDataRow(sheet);
        setColumnIndexNameMap(sheet);
        return sheet;
    }

    private void setColumnIndexNameMap(StandardSheet sheet) {
        ExcelRow header = sheet.getHeader();
        List<ExcelCell> cells = header.getCells();
        Map<Integer, String> rsMap = Maps.newHashMap();
        cells.forEach(c -> rsMap.put(c.getColumnNo(), c.getValue()));
        sheet.setColumnIndexNameMap(rsMap);
    }

    private void setRows(StandardSheet sheet, XSSFSheet raw) {
        List<ExcelRow> rows = Lists.newArrayList();
        Iterator<Row> rowIterator = raw.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            rows.add(rowParser.parse(row));
        }
        sheet.setRows(rows);
    }

    private void setHeader(StandardSheet sheet) {
        ExcelRow headerRow = sheet.getRows()
                .stream().filter(ExcelRow::isHeader).findFirst().orElse(null);
        sheet.setHeader(headerRow);
    }

    private void setDataRow(StandardSheet sheet) {
        List<ExcelRow> dataRows = sheet.getRows().stream()
                .filter(Predicate.not(ExcelRow::isHeader))
                .collect(Collectors.toList());
        sheet.setDataRows(dataRows);
    }

}
