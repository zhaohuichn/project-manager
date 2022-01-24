package com.project.manager.source.excel;

import com.project.manager.source.excel.sheet.ExcelSheet;

import java.net.URL;
import java.util.List;

/**
 * 标准Excel文件
 * <p>
 * Excel文件由多个sheet页组成，每个sheet页支持自定义解析
 *
 * @author ZHAOHUI
 */
public class StandardExcel extends AbstractExcel {
    @Override
    public void extend() {

    }

    @Override
    public String abstractPath() {
        return null;
    }

    @Override
    public URL url() {
        return null;
    }

    @Override
    public List<ExcelSheet> getSheets() {
        return null;
    }
}
