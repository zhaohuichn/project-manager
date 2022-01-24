package com.project.manager.parse.excel;

import com.project.manager.parse.excel.sheet.ExcelSheetParser;
import com.project.manager.parse.excel.sheet.StandardExcelSheetParser;
import com.project.manager.source.SourceLoader;
import com.project.manager.source.excel.Excel;
import com.project.manager.source.excel.StandardExcel;
import com.project.manager.util.ExcelUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

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
    public Excel parse(File file) {
        StandardExcel excel = new StandardExcel();
        excel.setName(file.getName());

        XSSFWorkbook workbook = ExcelUtil.readWorkbook(SourceLoader.load(file.getAbsolutePath()));
        if (null == workbook) {
            return excel;
        }

        int sheets = workbook.getNumberOfSheets();
        for (int sheetIndex = 0; sheetIndex < sheets; sheetIndex++) {
            excel.getSheets().add(sheetParser.parse(workbook.getSheetAt(sheetIndex)));
        }

        return excel;
    }


}
