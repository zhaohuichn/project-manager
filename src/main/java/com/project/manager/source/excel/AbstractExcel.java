package com.project.manager.source.excel;

import com.google.common.collect.Lists;
import com.project.manager.ext.Customizable;
import com.project.manager.source.AbstractSource;
import com.project.manager.source.excel.sheet.ExcelSheet;

import java.util.List;

/**
 * TodoExcel
 *
 * @author zhaohui
 */
public abstract class AbstractExcel extends AbstractSource implements Excel {

    private String name;

    private List<ExcelSheet> sheets;

    private List<Customizable> customizableHandler;


    public AbstractExcel() {
        this.sheets = Lists.newArrayList();
    }

    public AbstractExcel(String path) {
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
}
