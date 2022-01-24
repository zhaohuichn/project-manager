package com.project.manager.parse.excel;

import com.google.common.collect.Lists;
import com.project.manager.parse.excel.sheet.ExcelSheetParser;
import com.project.manager.parse.excel.sheet.StandardExcelSheetParser;
import com.project.manager.source.SourceLoader;
import com.project.manager.source.excel.Excel;
import com.project.manager.source.excel.StandExcel;
import com.project.manager.source.excel.row.ExcelRow;
import com.project.manager.source.excel.row.StandardRow;
import com.project.manager.source.excel.sheet.ExcelSheet;
import com.project.manager.source.excel.sheet.StandardSheet;
import com.project.manager.util.ExcelUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.net.URL;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * StandExcelParser
 *
 * @author ZHAOHUI
 */
public class StandardExcelParser implements ExcelParser {


    private ExcelSheetParser sheetParser;

    public StandardExcelParser() {
        sheetParser = new StandardExcelSheetParser();
    }

    @Override
    public Excel parse(URL url) {
        StandExcel excel = new StandExcel();

        XSSFWorkbook workbook = ExcelUtil.readWorkbook(SourceLoader.load(url));
        if (null == workbook) {
            return excel;
        }

        int sheets = workbook.getNumberOfSheets();
        for (int sheetIndex = 0; sheetIndex < sheets; sheetIndex++) {
            excel.getSheets().add(sheetParser.parse(workbook.getSheetAt(sheetIndex)));
        }

        return excel;
    }

    private void setRows(Excel excel, XSSFWorkbook workbook) {
        if (null == workbook) {
            return;
        }

        List<ExcelSheet> sheets = excel.getSheets();
        for (ExcelSheet sheet : sheets) {
            int index = sheet.getId();
            XSSFSheet xssfSheet = workbook.getSheetAt(index);
            List<ExcelRow> rows = getRows(xssfSheet);
            ExcelRow header = rows.stream().filter(ExcelRow::isHeader).findFirst().orElse(null);
            List<ExcelRow> dataRows = rows.stream().filter(Predicate.not(ExcelRow::isHeader)).collect(Collectors.toList());
            ((StandardSheet) sheet).setHeader(header);
            ((StandardSheet) sheet).setDataRows(dataRows);
        }

    }

    private List<ExcelRow> getRows(XSSFSheet xssfSheet) {
        List<ExcelRow> rows = Lists.newArrayList();
        int rowCount = xssfSheet.getLastRowNum();
        for (int i = 0; i < rowCount; i++) {
            StandardRow row = new StandardRow();
            row.setId(0);
            row.setHeader(0 == i);
            row.setCells(Lists.newArrayList());
            rows.add(row);
        }
        return rows;
    }


    private void setSheets(Excel excel, XSSFWorkbook workbook) {
        if (null == workbook) {
            return;
        }
        int sheets = workbook.getNumberOfSheets();
        for (int sheetIndex = 0; sheetIndex < sheets; sheetIndex++) {
            XSSFSheet xssfSheet = workbook.getSheetAt(sheetIndex);
            StandardSheet sheet = new StandardSheet();
            sheet.setId(sheetIndex);
            sheet.setName(xssfSheet.getSheetName());
            excel.getSheets().add(sheet);
        }
    }

}
