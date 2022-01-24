package com.project.manager.parse.excel;

import com.google.common.collect.Lists;
import com.project.manager.entity.source.excel.Excel;
import com.project.manager.entity.source.excel.StandExcel;
import com.project.manager.entity.source.excel.row.ExcelRow;
import com.project.manager.entity.source.excel.row.StandardRow;
import com.project.manager.entity.source.excel.sheet.ExcelSheet;
import com.project.manager.entity.source.excel.sheet.StandardSheet;
import com.project.manager.parse.excel.sheet.ExcelSheetParser;
import com.project.manager.util.ExcelUtil;
import org.apache.commons.io.output.BrokenWriter;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 本类是Excel文件解析的抽象父类.
 * 主要用于提供一组标准的解析模板，
 * <p>
 * Excel资源的解析主要是Sheet页数据的解析
 * Sheet页数据格式支持自定义，所以解析过程需要依赖于Sheet页定制的解析器
 *
 * @author ZHAOHUI
 */
public abstract class AbstractExcelParser implements ExcelParser {

    private List<ExcelSheetParser> sheetParsers;

    public AbstractExcelParser() {

    }

    public AbstractExcelParser(List<ExcelSheetParser> sheetParsers) {

    }


    @Override
    public Excel parse(URL url) {
        StandExcel excel = new StandExcel();

        XSSFWorkbook workbook = ExcelUtil.readWorkbook(url);

        // set sheet
        setSheets(excel, workbook);
        // set sheet row
        setRows(excel, workbook);

        // set sheet cell

        // parse header

        // parse rows
        List<XSSFRow> rows = ExcelUtil.getRows(sheet, 1);


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
