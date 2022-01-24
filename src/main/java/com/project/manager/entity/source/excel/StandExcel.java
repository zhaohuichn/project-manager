package com.project.manager.entity.source.excel;

import com.google.common.collect.Lists;
import com.project.manager.entity.source.AbstractSource;
import com.project.manager.entity.source.excel.sheet.ExcelSheet;
import com.project.manager.enums.SourceTypeEnum;

import java.net.URL;
import java.util.List;

/**
 * 标准输入Excel文件
 * <p>
 * Excel文件由多个sheet页组成，每个sheet页支持自定义解析
 *
 * @author ZHAOHUI
 */
public class StandExcel extends AbstractSource implements Excel {

    private List<ExcelSheet> sheets;

    public StandExcel() {
        this.sheets = Lists.newArrayList();
    }

    public StandExcel(String path) {
        super(path);
        sheets = Lists.newArrayList();
    }

    @Override
    public List<ExcelSheet> getSheets() {
        return sheets;
    }

    public void setSheets(List<ExcelSheet> sheets) {
        this.sheets = sheets;
    }

    @Override
    public SourceTypeEnum type() {
        return SourceTypeEnum.EXCEL;
    }

    @Override
    public String abstractPath() {
        return null;
    }

    @Override
    public URL url() {
        return null;
    }
}
