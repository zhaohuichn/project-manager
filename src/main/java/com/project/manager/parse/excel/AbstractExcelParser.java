package com.project.manager.parse.excel;

import com.project.manager.entity.source.excel.Excel;
import com.project.manager.parse.excel.sheet.ExcelSheetParser;

import java.net.URL;
import java.util.List;

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
        return null;
    }

}
