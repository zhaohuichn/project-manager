package com.project.manager.source.excel;

import com.google.common.collect.Lists;
import com.project.manager.source.AbstractSource;
import com.project.manager.source.excel.sheet.ExcelSheet;
import com.project.manager.util.SourceUtil;

import java.io.File;
import java.net.URL;
import java.util.List;

/**
 * TodoExcel
 *
 * @author zhaohui
 */
public abstract class AbstractExcel extends AbstractSource implements Excel {

    private String name;

    private List<ExcelSheet> sheets;

    public AbstractExcel() {
        this.sheets = Lists.newArrayList();
    }

    public AbstractExcel(String path) {
        super(path);
        sheets = Lists.newArrayList();
    }

    @Override
    public String name() {
        return new File(abstractPath).getName();
    }

    @Override
    public URL url() {
        return SourceUtil.getUrl(abstractPath);
    }

    @Override
    public ExcelSheet getByIndex(int index) {
        return sheets.get(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<ExcelSheet> getSheets() {
        return sheets;
    }

    public void setSheets(List<ExcelSheet> sheets) {
        this.sheets = sheets;
    }
}
